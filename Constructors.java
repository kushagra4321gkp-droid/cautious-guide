public class Constructors {
    public static void main(String[] args) {
        Student st = new Student();
        //System.out.println(st.name);

    }
}

class Student{
    String name;
    int rollNo;

    Student(){
        System.out.println("Constructor has been called...");
    }

    Student(String name){
        this.name = name;
    }
}
