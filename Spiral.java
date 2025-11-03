

public class Spiral {
    public static void printspiral(int matrix[][]){
        int startROW = 0;
        int startCOL = 0;
        int endROW = matrix.length-1;
        int endCOL = matrix[0].length-1;

        while(startROW <= endROW && startCOL <= endCOL){
            //top
            for(int j = startCOL; j<=endCOL; j++){
                System.out.print(matrix[startROW][j]+" ");
            }
            //right
            for(int i = startROW+1; i<= endROW; i++){
                System.out.print(matrix[i][endCOL] + " ");
            }

            //bottum
            for(int j = endCOL -1; j>= startCOL; j--){
                if(startROW == endROW){
                    break;
                }
                System.out.print(matrix[endROW][j]+ " ");
            }
            
            //left
            for(int i = endROW-1; i>= startROW+1 ; i--){
                if(startCOL == endCOL){
                    break;
                }
                System.out.print(matrix[i][startCOL]+ " ");
            }
            startROW++;
            startCOL++;
            endROW--;
            endCOL--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3},
                            {5,6,7}, 
                            {9,10,11}};
        printspiral(matrix);
    }
}
