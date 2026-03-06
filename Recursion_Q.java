import java.util.Scanner;

public class Recursion_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of element in array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in array:");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i = 0;

        key_occurrences(arr, key, i);
    }

    public static void key_occurrences(int[] arr, int key, int i){
        
        //base case
        if( i == arr.length){
            return;
        }

        //kaam
        if(arr[i] == key){
            System.out.print(i);
        }
        key_occurrences(arr, key, i+1);
    }
}
