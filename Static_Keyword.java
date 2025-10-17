public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Rampus";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        System.out.println(s3.schoolName);
    }
}

class Student{
    static calculatePercent(int maths, int chem, int phy){  //every object which is an instantiation of Student class might get diffrent marks for respective subjects resulting in diffrent percent but the methods definition would not be changed, it will be fixed for every object and i will be created in a memory at once! it will use less memory and so many benifits static keyword brings in programming!
        return (maths + chem + phy) / 3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}