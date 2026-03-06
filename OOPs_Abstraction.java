public class OOPs_Abstraction {
    public static void main(String[] args) {

        // horse h = new horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myhorse = new Mustang();
        
    }
}


abstract class Animal{

    Animal(){
        System.out.println("animal constructor called");
    }
    

    void eat(){
        System.out.println("eating food");
    }

    abstract void walk();
}

class horse extends Animal{

    horse() {
        System.out.println("horse constructor called");
    }


    void walk(){
        System.out.println("walks on a four legs");
    }
}

class Mustang extends horse{

    Mustang() {
        System.out.println("mustang constructor called");
    }

    
}

class Chicken extends Animal{


    
    void walk(){
        System.out.println("walks on 2 legs");
    }

}