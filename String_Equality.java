

public class String_Equality {
    public static void main(String[] args) {
        String s1 = "Deepal";
        String s2= "Deepal";
        String s3 = new String("Deepal");
        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
