// import java.util.Scanner;

// public class String_Exercise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String:");
//         String str1 = sc.nextLine();

//         // int count = 0;
        
//         // for(int i=0; i< str.length(); i++){
//         //     char ch = str.charAt(i);
//         //     if(ch== 'a' || ch== 'e'|| ch=='i' || ch=='o'|| ch=='u'){
//         //         count++;
//         //     }   
//         // }
//         // System.out.println(count);
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the Second String: ");
        String str2 = sc.nextLine();



        //Convert Strings to lowercase. Why? so that we don't have to check

        // separately for lower & uppercase.

        str1 = str1.toLowerCase () ;


        str2 = str2. toLowerCase () ;


        // First check - if the lengths are the same


        if(str1.length() == str2.length() ){


            // convert strings into char array


            char [] strlcharArray = str1. toCharArray () ;


            char[] str2charArray = str2. toCharArray () ;


            // sort the char array


            Arrays.sort (strlcharArray) ;

            Arrays.sort (str2charArray) ;

            // if the sorted char arrays are same or identical then the 
            //strings are


            // anagram


            boolean result = Arrays. equals (strlcharArray, str2charArray) ;

            if (result) {


                System. out.println (str1 + " and " + str2 + " are anagrams of eachother.") ;


            } else {


                System.out.println (str1 + " and " + str2 + " are not anagrams of each other.");


            } 
        }else{


            // case when lengths are not equal

            System.out.println (str1 + " and " + str2 + " are not anagram each other.");

        }
        
    }
}