class Person {
    String name;
}

public class passingObject{

    public static void changeName(Person p) {
        p.name = "Alice";  // modifies the object itself
    }

    public static void changeName1(Person p1) {
        p1.name = "Blice";  // modifies the object itself
    }

    public static void main(String args[]){
        Person person = new Person();
        person.name = "Bob";

        changeName(person);  // pass object to method
        changeName1(person);
        System.out.println(person.name);  // prints "Alice"
    }
}

//Key Takeaways:

// Passing objects to methods passes a copy of the reference, not the object itself.

// All references point to the same object in memory.

// Modifying the object’s fields is visible outside the method.

// Reassigning the reference inside a method (e.g., p = new Person()) does not affect the original object.

//Key: The reference is copied, but the object itself is shared.

//Gotcha: Many beginners think objects are “call by reference” in Java.

//Technically, Java is always call by value.

//The value for objects is the reference itself, which is why it sometimes looks like call by reference.