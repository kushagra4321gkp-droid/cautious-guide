public class Inheritance {
    public static void main(String[] args) {
        Fish fs = new Fish();
        fs.swim();
        fs.breathe();
        System.out.println(fs.color = "red");
    }
}

//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}

//Above was Single level Inheritance, Other then this we have:
//Multi Level Inheritance -> In this we go in depth
//Hierarchial Inheritance -> Parent or Base class is inherited by multiple derived classes at the same level
//Hybrid Inheritance -> happening mix of everyThing

// One more special type of Inheritance That is Multiple Inheritance, in this a derived class extends two parent class -> so it is the Hybrid kid of those two parent or base classes
// Multiple Inheritance is not there in JAVA, it is C++ concept
// ALthough we can implement multiple inheritance in JAVA indirectly!
// it is not implemented by classes. It is implemented by INTERFACES
// Multiple Inheritance is done using the concept of Interfaces
