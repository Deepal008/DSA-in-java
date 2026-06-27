import java.util.*;
import java.util.LinkedList;

public class Deque_StacknQueue {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }


    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }


    public static void main(String[] args){
        // Stack st = new Stack();
        // st.push(1);  
        // st.push(2);
        // st.push(3);
        // st.push(4);

        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
