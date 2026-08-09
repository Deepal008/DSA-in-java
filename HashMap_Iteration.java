import java.util.HashMap;
import java.util.Set;

public class HashMap_Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Itereation
        Set<String> keys = hm.keySet();

        for(String k : keys){
            System.out.println("key: "+k+ ", values: "+ hm.get(k));
        }
    }
}
