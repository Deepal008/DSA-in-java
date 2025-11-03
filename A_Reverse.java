public class A_Reverse {
    public static void reverse(int numbers[]){
        int fisrt = 0 , last = numbers.length-1;

        while(fisrt < last){
            int temp = numbers[fisrt];
            numbers[fisrt] = numbers[last];
            numbers[last] = temp;

            fisrt++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        reverse(numbers);

        for(int i = 0; i<= numbers.length; i++){
        System.out.print (numbers[i]+ " ");
        }
        System.out.println();
    }
}
