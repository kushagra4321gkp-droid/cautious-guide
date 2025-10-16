class skyscrapers{
    //This is Compile time Polymorphism or Static binding or early binding
    //Compile decides which method to run on the basis of type and number of Parameters
    //it doesn't depend on returntype
    void tallest(){
        System.out.println("tallest");
    }
    void tallest(String name){
        System.out.println(name + " is tallest");
    }
    void tallest(String name, int height){
        System.out.println(name + " is tallest with height of " + height);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
    }
}