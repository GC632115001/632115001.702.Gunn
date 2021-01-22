package Week7;

public class Dog extends Pet{
    int size;
    public void DogInf(int age,String name,String color , String species ,int size){
        this.age = age;
        this.species = species;
        this.color = color;
        this.name = name;
        this.size = size;
    }
    public void Bark(){
        int barkType = size;
        if(barkType==1){
            System.out.println("Small bark box box");
        }else if(barkType==2){
            System.out.println("Medium bark bork bork");
        }else if(barkType==3){
            System.out.println("Big bark woof woof");
        }
    }
    public void isshortHair(){
        int hair = size;
        if(hair==1){
            System.out.println("Short hair : true ");
        }else{
            System.out.println("Short hair : false ");
        }
    }
    public void Run(){
        System.out.println("My dog "+ name + " is running to the jungle " );
    }
}
