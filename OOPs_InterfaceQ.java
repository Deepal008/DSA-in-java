class OOPs_InterfaceQ{
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.food();
    }
}

interface Herbivore{

    void eat();
}

interface Carnivore{
    void food();
}

class Bear implements Herbivore, Carnivore{

    public void eat(){
        System.out.println("Eating grass");
    }

    public void food(){
        System.out.println("Eating meat");
    }
}