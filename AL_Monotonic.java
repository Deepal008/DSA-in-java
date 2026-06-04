import java.util.ArrayList;

public class AL_Monotonic{

    public static boolean monotonic(ArrayList<Integer> List){
        
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<List.size()-1; i++){
            int j= i+1;
            if(List.get(i) < List.get(j)){
                inc = false;
            }

            if( List.get(i) > List.get(j)){
                dec = false;
            }
        }

        return inc|| dec;
    }
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);

        System.out.println(monotonic(List));
    }
}