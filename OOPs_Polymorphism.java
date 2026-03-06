public class OOPs_Polymorphism {
  
    public static void main(String[] args){

        dog d = new dog();
        d.eat();
    }
}


//-----Run time polymorphism-------

//Method overrinding


class Animal{
    void eat(){
        System.out.println("Eating anything");
    }
}

class dog extends Animal{
    void eat(){
        System.out.println("eat only meat");
    }
}



//-----Compile time polymorphism------

// Method overloading

// class Calculator{

//     int sum(int a, int b){

//         return a+b;
//     }

//     float sum(float a, float b){
        
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }
