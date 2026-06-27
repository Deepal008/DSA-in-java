import java.util.*;
import java.util.LinkedList;

public class Queue_firstNonRepeating {

    public static void printNonRepeating(String str){

        int freq[] = new int[26];
        Queue<Character> qc = new LinkedList<>();
    
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            qc.add(ch);
            freq[ch-'a']++;

            while(!qc.isEmpty() && freq[qc.peek() - 'a'] >1){
                qc.remove();
            }

            if(qc.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(qc.peek());
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
