import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter first element");
            int a = sc.nextInt();
            System.out.println("enter second element");
            int b = sc.nextInt();
            System.out.println("enter operation");
            char operator = sc.next().charAt(0);
            // Calculator
            switch(operator){
                case '+' : System.out.println(a+b);
                break;

                case '-' : System.out.println(a-b);
                break;

                case '*' : System.out.println(a*b);
                break;

                case '/' : System.out.println(a/b);
                break;
                
                case '%' : System.out.println(a%b);
                break;

                default : System.out.println("invalid operaotr");
            }

            System.out.println("enter week number");
            int week = sc.nextInt();
            
            switch(week){
                case 1 : System.out.println("sunday");
                break;
                case 2 : System.out.println("monday");
                break;
                case 3 : System.out.println("tuesday");
                break;
                case 4 : System.out.println("wednesday");
                break;
                case 5 : System.out.println("thusday");
                break;
                case 6 : System.out.println("friday");
                break;
                case 7 : System.out.println("saturday");
                break;
                
                default: System.out.println("invalid week day");
            }
        }
    }
}