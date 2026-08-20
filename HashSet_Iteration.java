import java.util.HashSet;

public class HashSet_Iteration {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");


        // A : Using Iterators
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        // B : Advance loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}
