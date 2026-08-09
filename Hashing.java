import java.util.HashMap;

public class Hashing {
    public static void main(String[] args){
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("china", 50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));


        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Removes
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();  //for deleting every keys form the hashmap
        System.out.println(hm.isEmpty());



    }
}
