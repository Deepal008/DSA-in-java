import java.util.Scanner;

public class BT_Get_ith_bit {
    public static int ithbit(int n, int i){

        int result = n & (1<<i);
        if(result == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int Set_ith_bit(int n, int i){
        int result = n | (1<<i);
        return result;
    }

    public static int Clear_ith_bit(int n, int i){
        int result = n & (~(1<<i));
        return result;
    }

    public static int Update_ith_bit(int n, int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new bit for updation: ");
        int newbit = sc.nextInt();

        // if(newbit == 0){
        //     return Clear_ith_bit(n, i);
            
        // }else{
        //     return Set_ith_bit(n, i);
        // }

               /*-----OR----- */
        
        n = Clear_ith_bit(n, i);

        int Bitmask = newbit << i;
        return n | Bitmask;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter the index: ");
        int i = sc.nextInt();

        int bit = Update_ith_bit(n, i);
        System.out.println( bit);
    }
}
