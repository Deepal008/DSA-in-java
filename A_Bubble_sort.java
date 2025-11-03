
public class A_Bubble_sort {
    public static void sorting(int nums[]){
        

        for(int turn= 0; turn <= nums.length - 2; turn++){
            int swap = 0;
            for(int j = 0; j <= nums.length-2-turn; j++){
                if(nums[j] > nums[j+1] ){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
    public static void printnums(int nums[]){
        for(int i =0 ; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,3,2};

        sorting(nums);
        printnums(nums);
    }
}
