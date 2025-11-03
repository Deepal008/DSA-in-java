public class A_Insertion_sort {
    public static void insertion(int nums[]){
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            //finding out the corrent pos to insert
            while(prev>= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev];
                prev--;
            }
            //insertion
            nums[prev + 1] = curr;
        }
    }
    public static void printnums(int nums[]){
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.err.println();
    }
    public static void main(String args[]){
        int nums[] = {5,4,1,3,2};
        insertion(nums);
        printnums(nums);
    } 
}
