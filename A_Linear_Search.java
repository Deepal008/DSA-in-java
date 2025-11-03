import java.util.Scanner;

public class A_Linear_Search {
    public static int LinearSearch(int numbers[], int key){

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[]={2,4,6,8,10,12,14,16};
        System.out.println("enter the number which you want to search.");
        int key = sc.nextInt();
        
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Number is not found");
        }else{
            System.out.println("Key is at index :" + index);
        }
    }
}
