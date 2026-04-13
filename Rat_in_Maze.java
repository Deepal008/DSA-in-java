// import java.awt.datatransfer.SystemFlavorMap;

public class Rat_in_Maze{

    public static boolean RatInMaze(int maze[][], int i, int j, int n, int sol[][]){

        //base case
        if(i == n-1 && j==n-1 && maze[i][j] == 1){
            sol[i][j] = 1;
            printmatrix(sol);
            System.out.println();
            return true;
            
        }

        if(isSafe(maze, i, j, n)){


            sol[i][j] = 1;
            
            //move to down
            if(RatInMaze(maze, i+1, j, n, sol)){
                return true;
            }

            //move to right
            if(RatInMaze(maze, i, j+1, n, sol)){
                return true;
            }

            if(sol[i][j] == 0)
            return false;
        }
           
        return false;
    }

    public static void printmatrix(int sol[][]){
        for(int[] row : sol){
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int i, int j, int n){
        return (i>=0 && j>=0 && i<n && j<n && maze[i][j] == 1);
    }


    public static void main(String[] args){
        int maze[][] = {{ 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 }};
                        
    int n = maze.length;
    int[][] sol = new int[n][n];

    if(!(RatInMaze(maze, 0, 0, n, sol))){
        System.out.println("solution not found");
    }

    }

}