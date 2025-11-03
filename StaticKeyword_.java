class Mobile{
    String brand;
    static String name;

    void show(){
        System.out.println(brand + " | " + name);
    }
    //Non static method can access static variable.
    //you can access static variable and static method via class name
    

    //-----------------------------------------------------------------
    //*** you can access static variable from static method, but you can not access 
    //non static variable form static method ***
    public static void show2(Mobile obj){
        System.out.println(obj.brand + " | " + name);
    }



}

public class StaticKeyword_ {

    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.name = "phone";
        mob1.brand = "Apple";

        Mobile mob2 = new Mobile();
        mob2.name = "SmartPhone";
        mob2.brand = "Samsung";

        mob1.show();
        mob2.show();

        //Mobile.show2(); //this is not possible since in show2(which is static method) we are accessing a non static variable, and since not static variables belong to object, and static method show2(), belong to Mobile class, when you call Mobile.show2(), compiler is confused which object to refer, mob1 or mob2? because non static varible has different values for diffrent objects. so which objects variable value should i update or change? that why it shows error. but we can pass the reference to the method to avoid this confusion.like this -> 
        Mobile.show2(mob1);


    }
}
