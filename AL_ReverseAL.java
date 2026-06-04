import java.util.*;

public class AL_ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);



        //Reverse

        // for(int i = list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }

        //Find Maximum in AL
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<list.size(); i++){
        //     max = Math.max(max, list.get(i));
        // }

        // System.out.println(max);

        //Swap 2 numbers
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);


        //Sorting in AL
        // System.out.println(list);
        // Collections.sort(list); //ascending order
        // System.out.println(list);

        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    } 
}
  