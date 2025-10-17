//Abstrction basicly means simple an idea -> we don't talk about the implementation 
//hiding  the all the unnecessary details and showing only the important parts to the user.
//OR Showing only essential details and hiding the unnecessary implementation.
//We can inmplement Absatraction in two ways -> Abstract Classes -> Interfaces
//It is similar to Encapsulation which say wrapping up of all the data and functions in a single unit and implementing data hiding with the help of Access Modifiers.
 
public class Abstraction {
    public static void main(String[] args) {

        //Animal a = new Animal(); -> it will throw an error -> Animal is abstract; cannot be instantiated.

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color); //by Default -> it's "brown"
        System.out.println(c.color); //by Default -> it's "brown"

        h.color = "red";
        c.color = "black";

        System.out.println(h.color); 
        System.out.println(c.color);
    }

}

abstract class Animal{
    //But as we know that abstract class cann't be instantiated, so it should not have anything to do with Constructor. But that's wrong we can create constructor of any abstract class to initialise the child classes of it.

    String color;

    Animal(){
        //this.color = "brown"; -> this is also true;
        color = "brown"; //so by Default "brown" would be the color of all child of Animal unless we provide a method in child class to modify the color.
    }

    void eat(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks with 4 legs");
    }

    void changeColor(){
        color = "dark brown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks with 2 legs");
    }

    void changeColor(){
        color = "white";
    }
}