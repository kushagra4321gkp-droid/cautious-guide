class Car{
    String model;
    public Car(String model){
        this.model = model;
    }

    public String toString(){
        return "car model is " + model;
    }
}

public class toStringOverridden {
    public static void main(String[] args) {
        Car c = new Car("tesla");
        System.out.print(c);


    }
}