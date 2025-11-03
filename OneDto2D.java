import java.util.*;

public class OneDto2D {

    public static int[][] convertinto2DArray(int arr[], int m,int n){
        
        int matrix[][] = new int[m][n];
        
        int idx=0;
    
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr.length != m*n){
                    return new int[0][0];
                }else{
                    matrix[i][j] = arr[idx++];
                }
            }
        }
        return matrix;
    }
    

    public static void main(String[] args){
        
        int arr[] = {1,2,3,4};

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        convertinto2DArray(arr, m, n);

        
    }
}
