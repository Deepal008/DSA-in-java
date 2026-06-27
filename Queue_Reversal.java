import java.util.*;
import java.util.LinkedList;

public class Queue_Reversal {

    public static void reverse(Queue<Integer> q){
        int size = q.size();

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i< size; i++){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        System.out.println(q);
    }
}
