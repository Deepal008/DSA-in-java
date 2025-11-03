public class Swapping {

    public static void swap(int a , int b){
       
        //swap
        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("a =" + a);        //call by value
        System.out.println("b =" + b);
        
    }
    public static void main(String[] args) {    //java always work on call by value because is it pass copy of the values to the function.
        int a = 5;
        int b= 6;
        swap(a,b);                              // But whenever passes a original value then this is called call by reference. generally it is in c++.
        
    }
}
