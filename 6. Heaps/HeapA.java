import java.util.ArrayList;
public class HeapA {
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){  // O(log n)
            // step 1: Insert at last index
            arr.add(data);

            // step 2: fix Heap
            int x = arr.size()-1;
            int parentidx = (x-1)/2;
            while(arr.get(parentidx) > arr.get(x)){ // O(log n)
                int temp = arr.get(x);
                arr.set(x, arr.get(parentidx));
                arr.set(parentidx, temp);

                x = parentidx;
                parentidx = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {

            int data = arr.get(0);

            // step 1: swap(1st & last) node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2: remove last node
            arr.remove(arr.size()-1);

            // step 3: heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
