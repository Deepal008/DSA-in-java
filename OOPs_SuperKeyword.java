

public class OOPs_SuperKeyword {
    public static void main(String[] args){
        horse h = new horse();
        System.out.println(h.color);
    }
}

class Animal{

    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }
}

class horse extends Animal{

    horse() {
        super.color = "Blue";
        System.out.println("horse constructor called");
    }

   

}