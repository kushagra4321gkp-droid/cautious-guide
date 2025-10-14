public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("yellow");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color = "red";
        // System.out.println(p1.color);

        //BANK ACCOUNT
        BankAccount myAccount = new BankAccount();
        myAccount.name = "Kushagra";
        System.out.println(myAccount.name);
        myAccount.setPassword("fihfhfwkl");
    }
}

class BankAccount{
    public String name;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setTip(int newTip){
        tip = newTip;
    }

    void setColor(String newColor){
        color = newColor;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}