import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AL_Most_Frequent_number{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        
        // int result[] = new int[1000];


        // for(int i=0; i<list.size()-1; i++){
        //     if(list.get(i) == key){
        //       result[list.get(i+1)-1]++;
        //     }
        // }
        
        // int max = Integer.MIN_VALUE;
        // int ans = 0;

        // for(int i=0; i<1000; i++){
        //     if(result[i] > max){
        //         max = result[i];
        //         ans = i+1;
        //     }
        // }

        // System.out.println(ans);


        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< list.size()-2; i++){
            if(list.get(i) == key){
                hm.put(list.get(i+1), hm.getOrDefault(list.get(i+1), 0)+1);
            }
        }

        int max = 0;
        int ans = -1;

        for(int target : hm.keySet()){
            if(hm.get(target) > max){
                max = hm.get(target);
                ans = target;
            }
        }

        System.out.println(ans);
    }
}