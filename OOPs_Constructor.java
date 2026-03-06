 

public class OOPs_Constructor {
    public static void main(String[] args) {     //constructor is special function that runs when you create an object and it allocate some variables. 
        Student s1 = new Student();
        // Student s2 = new Student("Shraddha khapra");
        // System.out.println(s2.name);
        // Student s3 = new Student(34);
        // System.out.println(s3.rollno);


        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 56;
        s1.marks[2] = 89;

        Student s2= new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i =0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

//create a cl ass
//for every single student
class Student{
    String name;  
    int rollno;
    String password;
    int marks[];

    //Non parameterized
    Student(){
        System.out.println("Deepal yadav");
    }

    //parameterized
    Student(String name){
        this.name = name;
    }

    Student(int rollno) {
        
        this.rollno = rollno;
    }

    Student(Student s1){

        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }
    
  
    
    
}