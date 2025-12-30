public class BitmanipulationQ {
    
    public static void oddEven(int n){
        int bitmask =1;

        if((n & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddEven(3);
        oddEven(11);
        oddEven(6);
    }
}
