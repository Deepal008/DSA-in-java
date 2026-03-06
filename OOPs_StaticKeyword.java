public class OOPs_StaticKeyword {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.schoolName = "ABIC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "DCLMS";

        Student s4 = new Student();
        System.out.println(s4.schoolName);
    }
    
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String Name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
