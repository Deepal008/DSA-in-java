import java.util.*;
public class A_binary_search {
    public static int binarysearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start<=end){
            int mid = (start+end) / 2;

            //comparisons
            if(number[mid]==key){
                return mid;
            }
            if(number[mid] < key){ //right
                start = mid + 1;
            }else{ //left
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {2,4,6,8,10,12,14,16};
        System.out.println("enter the number which you want to search");
        int key = sc.nextInt();

        System.out.println("index for key is : " + binarysearch(number, key));
    }
}
