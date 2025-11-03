



public class A_2D_Q {
    // public static void foundseven(int matrix[][], int key){
    //     int countof7 = 0;
    //     for(int i =0; i< matrix.length; i++){
    //         for(int j = 0; j< matrix[0].length; j++){
    //             if(matrix[i][j] == key){
    //                 countof7++;
    //             }
    //         }
    //     }
    //     System.out.println(countof7);
    // }
    // public static void main(String[] args) {
    //     int matrix[][] = {{4,7,8},{8,8,7}};
    //     int key = 7;
    //     foundseven(matrix, key);
         
    // }

    // public static void rowsum(int matrix[][]){
    //     int sum = 0;
    //     for(int i = 0; i< matrix.length; i++){
    //         for(int j = 0; j < matrix[0].length; j++){
    //             if(i == 1){
    //                 sum += matrix[1][j];
                    
    //             }
    //         }

    //     }
    //     System.out.println(sum);
    // }
        
    
    // public static void main(String[] args){
    //     int matrix[][] = {{1,4,9},
    //                       {11,4,3},
    //                       {2,2,3}};
        
    //     rowsum(matrix);                  
    // }


    public static void main (String [] args){
        int matrix[][] = {{1,2,3},
                          {4,5,6}};
        
        int newmatrix[][] = new int[3][2];

        for(int i = 0; i< 2; i++){
            for(int j = 0; j< 3; j++){
                newmatrix[j][i] = matrix[i][j];
            }
        }

        for (int[] newmatrix1 : newmatrix) {
            for (int j = 0; j< newmatrix[0].length; j++) {
                System.out.print(newmatrix1[j] + " ");
            }
            System.out.println();
        }

    }
}
