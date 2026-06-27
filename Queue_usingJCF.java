// import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Queue_usingJCF {
    public static void main(String[] args){

        // Queue<Integer> nq = new LinkedList<>();
        Queue<Integer> nq = new ArrayDeque<>();
        nq.add(1);
        nq.add(2);
        nq.add(3);

        while(!nq.isEmpty()){
            System.out.println(nq.peek());
            nq.remove();
        }
    }
}
