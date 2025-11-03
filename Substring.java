public class Substring {

    public static String subS(String str, int si, int ei){
        String Substr ="";
        for(int i =si; i<ei; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.substring(0,5));
    //     System.out.println(subS(str, 0, 7));
    }
}
