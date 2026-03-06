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

    public static int clearIBits(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int ClearRangeIbits(int n, int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter jth bit: ");
        int j = sc.nextInt();
        int a = (~0 << j+1);
        int b = (1<<i)-1;

        return n & a|b;
    }

    public static boolean IsPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countsetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();

        // System.out.print("Enter the index: ");
        // int i = sc.nextInt();

        // int bit = ClearRangeIbits(n, i);   
        System.out.println( fastExpo(5, 3));
    }
}
