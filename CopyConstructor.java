public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kushagra";
        s1.roll = 123;
        s1.marks[0] = 99;
        s1.marks[1] = 78;
        s1.marks[2] = 88;

        for(int i = 0; i<3; i++){
            System.out.println(s1.marks[i]);
        }

        Student s2 = new Student(s1);
        s1.marks[0] = 100;
        // System.out.println(s2.name);
        // System.out.println(s2.roll);

        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }



    }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        int marks[] = new int[3];
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    Student(Student s1){
        int marks[] = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = this.marks;
    }
}

//learn about Deep copy and Shallow copy and also learn about Copy Constructors once again for tha sake of revision as well as concept strengthening .