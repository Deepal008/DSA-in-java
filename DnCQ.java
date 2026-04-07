public class DnCQ{
    public static void main(String[] args){
        
        int nums[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));

    }


    // Brute force Solution

    // public static int majorityelement(int[] nums){
        
    //     int majoritycount = nums.length/2;

    //     for(int i = 0; i< nums.length; i++){

    //         int count=0;

    //         for(int j = 0; j <nums.length; j++){

    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //         }

    //         if(count > majoritycount){
    //             return nums[i];
    //         }
    //     }
        
    //     return -1;
    // }


    public static int countInRange(int[] nums, int num, int lo, int hi) {
        
        int count = 0;

        for(int i = lo;  i<= hi; i++){
            if(nums[i] == num){
                count++;
            }
        }

        return count;
    }
    public static int majorityelementRec(int[] nums, int lo , int hi){

        if(lo == hi){
            return nums[lo];
        }

        int mid = (hi-lo)/2 + lo;

        int left = majorityelementRec(nums, lo, mid);
        int right = majorityelementRec(nums, mid+1, hi);

        if(left == right ){
            return left;
        }

        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;


    }

    public static int majorityElement(int[] nums){
        return majorityelementRec(nums, 0, nums.length-1);
    }
}