import java.util.LinkedList;

public class LL_inJavaCF {
    public static void main(String[] args) {
        
        //Create - objects int, float, boolena -> Integer, Float, Character

        LinkedList<Integer> ll = new LinkedList<>();

        //add

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
         
        System.out.println(ll);



        //remove

        ll.removeLast();
        ll.removeFirst(); 
        System.out.println(ll);

    }
}
