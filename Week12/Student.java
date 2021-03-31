package Week12;

public class Student {
    String name;
    int age;
    double gpa;
    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public boolean equals(int num1){
        if(age == num1){
            return true;
        } else{
            return false;
        }
    }
    public boolean equals(double num2){
        if(gpa == num2){
            return true;
        } else{
            return false;
        }
    }
}
