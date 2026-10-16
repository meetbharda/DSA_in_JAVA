import java.util.ArrayList;

public class StackA {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push
        public static void push(int data){
            list.add(data);
        }

        //Pop
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
    }
}