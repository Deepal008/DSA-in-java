

public class A_pair {
    public static void pair(int numbers[]){
        int tp=0;

        for(int i = 0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.err.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
            
        }
        System.err.println("total pair = " + tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pair(numbers);

    }
}
