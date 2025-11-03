public class A_Sorting_Q {
    public static void bubblesort(int nums[]){
        for(int turn =0; turn<= nums.length-2; turn++){
            for(int j = 0; j<=nums.length-2-turn; j++){
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void printnums(int nums[]){
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }



    public static void selectionsort(int nums[]){
        for(int i=0; i<= nums.length-2; i++){
            int maxpos = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[maxpos] < nums[j]){
                    maxpos = j;
                }
            }
            //swap
            int temp = nums[maxpos];
            nums[maxpos] = nums[i];
            nums[i] = temp;
        }
    }

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
    public static void main(String[] args){
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        insertion(nums);
        printnums(nums);
    }
}
