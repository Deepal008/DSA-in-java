import java.util.*;

public class String_largest {

    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        // String fruits[] = {"apple", "mango", "banana"};

        // String largest = fruits[0];
        // for(int i = 0; i< fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        Scanner sc = new Scanner(System.in);

        // String name;
        // name = sc.nextLine();
        // System.out.println(name.length());

        //concatenation
        String firstname = "Deepal";
        String lastname = "Yadav";
        String fullname = firstname+" "+ lastname;
        
        printLetters(fullname);
    }
}
