package Week9;

public class Student {
    private String firstname;
    private String lastname;
    public Student(String firstname,String lastname){
        this.firstname =firstname;
        this.lastname=lastname;
    }
    public String toString(){
        return "My first name "+firstname+" last name "+ lastname;
    }
    public static void main(String[] args){
        Student p = new Student("Gunn", "Chochuwong");
        System.out.println(p.toString());
    }
}
