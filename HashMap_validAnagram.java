import java.util.HashMap;

public class HashMap_validAnagram {

    public static boolean isvalidAnagram(String s, String t){
        HashMap<Character, Integer> hm = new HashMap<>();

        int count =0;

        if(s.length() != t.length()){
            return false;
        }


        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }

        // for(int i=0; i<t.length(); i++){
        //     if(hm.containsKey(t.charAt(i))){
        //         count++;
        //     }
        // }

        // if(s.length() == count){
        //     return true;
        // }

        for(int i =0; i< t.length(); i++){
            if(hm.get(t.charAt(i)) != null){
                if(hm.get(t.charAt(i)) == 1){
                    hm.remove(t.charAt(i));
                }else{
                    hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }

        return hm.isEmpty();
    }
    public static void main(String[] args){
        String s = "tulip" , t = "lipid";
        System.out.println(isvalidAnagram(s, t));
    }
}
