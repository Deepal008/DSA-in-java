import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_implementation {

    
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // if we want to reverser priorityQueue the i'll have to use this Comparator.reverseOrder()


        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //O(1)
            pq.remove();   //O(logn)
        }
    }
}
