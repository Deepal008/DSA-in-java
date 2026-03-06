

public class OOPs {
    public static void main(String[] args) {
    
        pen p1 = new pen();
    p1.setcolor("green");
    System.out.println(p1.getcolor());

    p1.setTip(5);
    System.out.println(p1.tip);

    BankAccount myAcc = new BankAccount();
    myAcc.username = "Deepal yadav";
    myAcc.setpassword("abcdefghi");
    
    }
}

class pen {
    String color;
    int tip;

    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}

class BankAccount{
    public String username;
    private static String password; 
    public static void setpassword(String pwd){
        password = pwd;
    }
}