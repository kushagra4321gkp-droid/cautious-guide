public class ConstructorCallingInInheritanceHeirarchy {
    public static void main(String[] args) {
        //we would only create object of Mustang
        //The heirarchy should be
        //Animal -> Horse -> Mustang
        Mustang myHorse = new Mustang();
        
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal's Constructor called...");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse's Contructor called...");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang's Contructor called...");
    }
}