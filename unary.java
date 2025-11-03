public class unary {
    public static void main(String[] args) {
        //pre increment operator 
        int a = 5;
        int b = ++a;             /*1. Value change ,then value use */
        System.out.println(a);
        System.out.println(b);
    
        //post increment operator
        int c = 5;
        int d = c++;              /*Value use then value change */
        System.out.println(c);
        System.out.println(d); 
        

        // //pre decrement operator 
        // int a = 5;
        // int b = --a;             /*1. Value change ,then value use */
        // System.out.println(a);
        // System.out.println(b);
    
        // //post decrement operator
        // int c = 5;
        // int d = c--;              /*Value use then value change */
        // System.out.println(c);
        // System.out.println(d); 
    }
}
