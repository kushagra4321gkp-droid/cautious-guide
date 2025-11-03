class Mobile{
    static String brand;
    static String name;

    static{
        brand = "maruti";
        name = "Phone";
        System.out.println("in static block...");
    }

    Mobile(){
        System.out.println("in the constructor...");
    }

    void show(){
        System.out.println(brand + " | " + name);

    }
}

public class Static_Block_UseCase {
    public static void main(String[] args) {

        System.out.println("main...");

        Mobile obj1 = new Mobile();

        Mobile obj2 = new Mobile();

        Mobile obj3 = new Mobile();

        obj1.show();

        System.out.println(Mobile.brand);


     }
}

//Your previous example
// class Demo {
//     static {
//         System.out.println("Static block runs before main()!");
//     }

//     public static void main(String[] args) {
//         System.out.println("Main method...");
//     }
// }


// Here:

// JVM loads the Demo class (because it contains main()).

// While loading Demo, the static block of that same class executes.

// Then main() runs.

// ✅ Output:

// Static block runs before main()!
// Main method...


// That’s why it looks like “static runs before main”.

// 🔹 Your current example
// class Mobile {
//     static String brand;
//     static String name;

//     static {
//         brand = "maruti";
//         name = "Phone";
//         System.out.println("in static block...");
//     }

//     Mobile() {
//         System.out.println("in the constructor...");
//     }

//     void show() {
//         System.out.println(brand + " | " + name);
//     }
// }

// public class Static_Block_UseCase {
//     public static void main(String[] args) {
//         System.out.println("main...");

//         Mobile obj1 = new Mobile();
//         Mobile obj2 = new Mobile();
//         Mobile obj3 = new Mobile();

//         obj1.show();
//         System.out.println(Mobile.brand);
//     }
// }


// Now we have two separate classes:

// Static_Block_UseCase → contains main()

// Mobile → contains the static block

// ⚙️ Step-by-step Execution

// 1️⃣ JVM loads the class that contains main() — that’s Static_Block_UseCase.

// It checks for a main(String[] args) method.

// Since Static_Block_UseCase has no static block, nothing special runs yet.

// 2️⃣ JVM calls main() of Static_Block_UseCase.

// So the first printed line is:

// main...


// 3️⃣ Inside main(), you do:

// Mobile obj1 = new Mobile();


// At this exact moment, JVM realizes it now needs to load the Mobile class.

// While loading Mobile, it executes Mobile’s static block once.

// So you see:

// in static block...


// 4️⃣ Then the constructor of Mobile runs for each object:

// in the constructor...
// in the constructor...
// in the constructor...


// ✅ Final Output Order

// main...
// in static block...
// in the constructor...
// in the constructor...
// in the constructor...
// maruti | Phone
// maruti

//----------------------------------------------------------------------------------------------
//why we can't call Mobile.static since the static{ } block is initself static then wht we can't access it via class name?

//Excellent observation — this question shows you’re really thinking deeply about how static blocks work in Java. ✅

// Let’s break it down carefully 👇

// 🔹 First — What a static { } block really is

// A static block is not a variable, not a method, not a property — it’s a piece of code that runs automatically when the class is loaded into JVM memory.

// You can think of it like a “setup section” that prepares static data for the class.

// Example:

// class Mobile {
//     static String brand;
//     static String name;

//     static {
//         brand = "maruti";
//         name = "Phone";
//         System.out.println("in static block...");
//     }
// }


// Here, the static block executes once per class, when the class loader loads Mobile — not when you call it.

// 🔹 Why can’t we call it like Mobile.static?

// Because:

// static { } is not a member that you can refer to.

// It has no name, no return type, and no parameters — so you can’t call or reference it.

// You can only trigger it indirectly by causing the class to load.

// 🔹 When does it execute?

// It executes automatically when the class is loaded for the first time, which can happen in these cases:

// When you first access any static member (e.g., Mobile.brand)

// When you create the first object of that class (constructor call indirectly loads class)

// When you explicitly load it using Class.forName("Mobile")

// 🔹 Example to prove it
// class Test {
//     static {
//         System.out.println("Static block runs!");
//     }

//     static void hello() {
//         System.out.println("Hello method");
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Test.hello(); // static block runs first automatically
//     }
// }


// Output:

// Static block runs!
// Hello method


// Even though you never “called” the static block — it ran automatically because accessing a static member (hello) forced the JVM to load the Test class.

// 🔹 Summary
// Concept	Explanation
// static { }	Code that runs once when the class loads
// Callable?	❌ No — can’t be called directly like a method
// When runs	On first class load (via object creation, static member access, or Class.forName())
// Purpose	Initialize static variables, perform setup once

// If you want something you can call using the class name, make it a static method, like:

// class Mobile {
//     static void init() {
//         System.out.println("Manual static initializer");
//     }
// }

// Mobile.init(); // ✅ can be called


// Would you like me to show a short example comparing
// 👉 static block vs static method vs constructor
// to see when each executes and how they differ?
 