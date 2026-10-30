import java.util.ArrayList;
public class HeapA {
    class Heap {
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
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
