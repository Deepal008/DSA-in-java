public class Promotion {
    public static void main(String[] args) {
        byte bt = 5;
        short a = 21;
        char ch = 'b';
        int sum = bt + a + ch;            /*1. Java automatically promotes each bytes, short or char operand to int when evaluating an expression.  */
        System.out.println(sum);          /*2. If one oerand is long, float or double the whole expression is promoted to long , float or double respectively*/
        
        // this is wrong
        // byte b = 5;
        // byte d = b*2;
        // System.out.println(d);

       // right 
       byte b = 5;
       byte d = (byte)(b*2);
       System.out.println(d);
    }
}