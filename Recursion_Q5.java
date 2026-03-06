public class Recursion_Q5 {
    public static void main(String[] args){
        int n = 3;
        int a , b , c;

        TowerHanoi(n, 'A', 'B', 'C');
    }

    public static void TowerHanoi(int n, char a, char c, char b){

        if(n==1){
            System.out.println("move disk 1 from " + a +" to "+ b);
            return;
        }

        TowerHanoi(n-1, a, b, c);

        System.out.println("Move disk " + n + " from " + a + " to " + b);

        // Step 3: Move n-1 disks from helper to destination
        TowerHanoi(n - 1, c, a, b);
    }
}
