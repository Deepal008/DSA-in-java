

public class OOPs_InheritanceQ {
    public static void main(String[] srga){

        peacock child = new peacock();
        child.eat();
    }
}

//Base
class Animal{

     void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}

//derived
class fish extends Animal{
 
    void swim(){
        System.out.println("swim");
    }
}

class Tuna extends fish {
    
    
}

class Shark extends fish{

}


//Derived
class bird extends Animal{

    void fly(){
        System.out.println("fly");
    }
}

class peacock extends bird{

}


//Derived
class Mammal extends Animal{

    void walk(){
        System.out.println("Walk");
    }
}

class dog extends Mammal{

}