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

// suppose i create a string s1 = "hello" , now i remember once i have created an array lets suppose int arr[ ] = {1, 2, 3}, and when i put it in like System.out.println(arr) i gives me the hashaddress but when i do System.out.println(s1) it prints the value of s1 h as hello. why? s1 is object too like arr right?