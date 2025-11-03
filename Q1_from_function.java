public class Q1_from_function {
    public static int multiply(int a, int b){
        
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int prod= multiply(3,7);
        System.out.println("a*b :" + prod);

        prod = multiply(10, 5);
        System.out.println("a*b :" + prod);
    }
}