//Abstrction basicly means simple an idea -> we don't talk about the implementation 
//hiding  the all the unnecessary details and showing only the important parts to the user.
//OR Showing only essential details and hiding the unnecessary implementation.
//We can inmplement Absatraction in two ways -> Abstract Classes -> Interfaces
//It is similar to Encapsulation which say wrapping up of all the data and functions in a single unit and implementing data hiding with the help of Access Modifiers.
 
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks with 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks with 2 legs");
    }
}