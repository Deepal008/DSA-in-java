
public class Recursion {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // decreasingvalue(n);

        // increasingvalue(n);

        // System.out.println(fibonacci(n));

        // int[] arr = {1,2,3,4,5,5};
        // System.out.println(lastOccurance(arr, 0, 5));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tiling(5 ));

        // System.out.println(friendsPair(3));

        printBinstring(3, 0,  ""); 
    }  

    public static void decreasingvalue(int n){

        if(n==1){
            System.out.print(n);                        //remember one thing always make a base case in the recursion.
            return;
        }
        System.out.print(n+" ");
        decreasingvalue(n-1);
    }

    public static void increasingvalue(int n){

        if(n==1){
            System.out.print(n+" ");                        
            return;
        }
        increasingvalue(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n) {

        if(n == 0){
            return 1;
        }
        
        int fn = n * factorial(n-1);
        return fn;
    }

    public static int naturalSUM(int n) {

        if(n == 0){
            return 1;
        }
        
        int sum = n + naturalSUM(n-1);
        return sum;
    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fibo;

        fibo = fibonacci(n-1) + fibonacci(n-2);

        return fibo;
    }

    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr , i+1);
    }

    public static int firstOccurance(int[]  arr, int i, int key){
        if(i == arr.length){
            return -1; 
        }
        
        if(arr[i] == key){
            return i;
        }

        return firstOccurance(arr, i+1, key);
    }

     public static int lastOccurance(int[]  arr, int i, int key){
        if(i == arr.length){
            return -1; 
        }
        int isfound = lastOccurance(arr, i+1, key);

        if(isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }

    public static int pow(int x, int n){
        if(n == 1){
            return x;
        }
        
        if(n == 0){
            return 1;
        }
        return x * pow(x, n-1);
    }

    public static int optimizepower(int x, int n) {
        if(n== 0){
            return 1;
        }

        int halfpower = optimizepower(x, n/2);
        int halfpowerSQ = halfpower*halfpower;

        if(n%2 != 0){
            halfpowerSQ = x* halfpowerSQ;
        }

        return halfpowerSQ;
    }

    public static int tiling(int n){   // 2 * n (floor size)

        //Base case
        if(n == 0 || n ==1){
            return 1;
        }
         
        // kaam
        //vertical choice
        int fnm1 = tiling(n-1);


        //horizontal choice
        int fnm2 = tiling(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }


    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean map[]){
        if( idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }


    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // int totalways;

        //             // choice single             choice pair
        // totalways = friendsPair(n-1) + (n-1) * friendsPair(n-2);
        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }

    public static void printBinstring(int n, int lastPlace, String str){

        if(n == 0){
            System.out.println(str);
            return;
        }


        // printBinstring(n-1, 0, str.append("0"));
        // if(lastPlace == 0){                             //if i use StringBuilder
        //     //sit 0 on chair n
        //     printBinstring(n-1, 1, str.append("1"));
        // }

        //kaam
        printBinstring(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBinstring(n-1, 1, str+"1");
        }
    }
}