package Week6;
//63215001 gunn chochuwong
public class Person {
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name ;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is "+ name +" My age is "+ age +"My gender is"+gender);    
    }
}