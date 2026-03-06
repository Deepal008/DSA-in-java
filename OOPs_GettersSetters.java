public class OOPs_GettersSetters {
    public static void main(String[] args) {
        pen p1 = new pen();


    }
}


class pen{
    String color;
    int tip;

    String getcolor(){
        return this.getcolor();
    }

    void setColor(String newcolor){
        this.color = newcolor;
    }
}