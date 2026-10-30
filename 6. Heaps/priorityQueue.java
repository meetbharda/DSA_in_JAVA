import java.util.*;
public class priorityQueue {

    static class  Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override 
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // pq.add(7);  // O(log n)
        // pq.add(1);
        // pq.add(5);

        pq.add(new Student("A", 4));  
        pq.add(new Student("B", 7));  
        pq.add(new Student("C", 2));  

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+ " -> "+pq.peek().rank);  // O(1)
            pq.remove();    // O(log n)
        }
    }
}
