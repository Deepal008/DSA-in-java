public class Conversion {
    public static void main(String[] args) {
        // int a = 67;
        // long b = a;
        // System.out.println(b);     /*this type of converion can be occur in java because int contain less bytes than long  and this is called implicit type conversion */
        long c = 23;
        int d = (int )c;
        System.out.println(d);  /* this type of conversion can't be occur because long contain more bytes than int and this is called lossy conversion*/

        // char ch = '1';
        // int num = ch;
        // System.out.println(num);

        // float pi = 3.14f;
        // int num = (int)pi;                //explicit conversion
        // System.out.println(num);



    }
}

//byte > Short > int > float > long > double