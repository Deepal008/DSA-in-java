



public class A_kadane_method {
    public static void kadaneAlgo(int numbers[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
       
        for(int i = 0; i<numbers.length; i++){
           currsum = currsum + numbers[i];
           if(currsum<0){
            currsum = 0;
           }
           maxsum = Math.max(currsum, maxsum);  // this maths function used to compare maximum number and store it in the variable.
           
           
        }
        
        System.err.println("max subarray sum is :" + maxsum);
    }


    public static void smallest(int numbers[]){

        int currsum = 0;
        for(int i = 0; i<numbers.length; i++){
            currsum = currsum + numbers[i];
        }
        System.out.println(" sum is : "+ currsum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1, -3, 4, -1, -2};
        smallest(numbers);
    }
} 