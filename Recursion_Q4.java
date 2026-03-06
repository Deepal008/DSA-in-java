public class Recursion_Q4 {
    public static void main(String[] args){
        String str = "abcab";
        int i = 0;
        int n = str.length();
        int j = n-1;

        System.out.println(countsubstring(str, i, j, n));
    }

    public static int countsubstring(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }

        if(n <= 0){
            return 0;
        }

        int res = countsubstring(str, i+1, j, n-1) + countsubstring(str, i, j-1, n-1) - countsubstring(str, i, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        
        return res;
    }
}