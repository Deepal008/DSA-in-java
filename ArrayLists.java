import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        //Add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);
        System.out.println(list); 


        //Get Operation  O(1)
        int element = list.get(2);
        System.out.println(element);
        

        //Delete  O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at index O(n)

        list.set(2,10);
        System.out.println(list);

        //Contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));


        System.out.println(list.size());
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+",");0
        }
        
    }
}
