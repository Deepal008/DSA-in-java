

public class OOPs_Inheritance {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "meat";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
    }
}

//Base class
class Animal{ 
    String color;

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

//Derived class
// class Fish extends Animal {

//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// } 