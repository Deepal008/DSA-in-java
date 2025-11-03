import java.util.*;

public class A_2D_1 {


    public static void Max_and_min(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
            
            largest = Math.max(largest, matrix[i][j]);
            minimum = Math.min(minimum, matrix[i][j]);
            
            
            }
        }
        System.out.println("Largest number of the matrix:" + largest);
        System.out.println("Minimun number of the matrix " + minimum);
    }
    public static boolean search(int matrix[][], int key){
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++) {
                
               if(matrix[i][j] == key){
                System.out.println("Key found at" + "("+ i + " "+ j + ")");
                return true;
               }
                
            }
           
        }
        
        System.out.println("Key not found");
        return false;
    }
    public static void main(String [] args){
        int matrix[][] = new int [3][3];

        Scanner sc = new Scanner(System.in);
        //for rows
        for(int i = 0; i<matrix.length; i++){
            //for colums
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        search(matrix, 6);
        Max_and_min(matrix);

    }
}
