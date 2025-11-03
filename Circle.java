import java.util.*;

public class Circle {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            float r = sc.nextFloat();
            float area = 3.14f * r * r ;
            System.out.println(area);
         }
        
    }
}
