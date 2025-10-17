public class Super_Keyword {
    public static void main(String[] args) {
        //Super Keyword is used to refer immidiate Parent class Object
        //To access Parent's class (1)Properties (2)Functions (3)Constructors

        Dog d = new Dog();
        d.show();
        d.fieldShower();
        
    }
}

class Animal{
    String color = "brown";

    Animal(){
        System.out.println("Animal class Constructor...");
    }

    void show(){
        System.out.println("Animal's show function");
    }
}

class Dog extends Animal{
    String color = "red";

    Dog(){
        super();
        System.out.println("Dog's constructor called");
    }

    void show(){
        super.show();
        System.out.println("Dog's show function");
    }

    void caller(){
    //super(); -> this is wrong because super() can only be called inside subclass's Constructor
    super.show();
    }

    void fieldShower(){
        System.out.println(super.color);
        System.out.println(this.color);
    }
}
