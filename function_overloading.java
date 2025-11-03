
public class function_overloading {                   //using parameter
//     //function to calculate sum of 2 no
//     public static int sum(int a, int b){
//         return a+b;                                    // In function overloading same name fuction can exit but not with same parameter and different return type.
//     }

//     //function to calculate sum of 3 no.
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a");
//         int a= sc.nextInt();
        
//         System.out.println("enter b");
//         int b = sc.nextInt();
        
//         System.out.println("sum of 2 no :" + sum(a,b));
        
//         System.out.println("enter c");
//         int c = sc.nextInt();
        
//         System.out.println("sum of 3 no : " + sum(a,b,c));
//     }


    public static int sum(int a, int b){            //using data type
    return a+b;
   }

   public static float sum(float a, float b){
    return a+b;
   }

   public static void main(String[] args) {
       

       System.out.println("sum of these integer numbers :" + sum(4,6));

       System.out.println("sum of these flaot numbers :" + sum(3.5f,4.1f));
   }
}