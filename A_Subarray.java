public class A_Subarray {
    public static void printsubarray(int numbers[]){
        int sum ;
        int ts = 0;
        int maxsum = Integer.MIN_VALUE;  // -infinity
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                sum = 0;
                for(int k = start; k<=end; k++){
                    
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                    
                }
                ts++;
                if(maxsum<sum){
                    maxsum = sum;
                }
                System.err.println();
                System.err.println("the sum of the subarray :" + sum);
            }
            
            System.out.println();
        }
        
        System.err.println("total subarray ="+ ts);
        System.err.println("max sum" + maxsum);               //for max subarray
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printsubarray(numbers);
    }
}
