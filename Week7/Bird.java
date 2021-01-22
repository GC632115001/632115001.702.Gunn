package Week7;

public class Bird extends Pet {
    String country;
    int canfly;
    public void BirdInf(int age,String name,String color , String species ,String country,int canfly){
        this.age = age;
        this.species = species;
        this.color = color;
        this.name = name;
        this.country = country;
        this.canfly = canfly;
    }
    public void Speak(){
        System.out.println("Hello my name is " + name + "i am a "+ species+ " i am "+ age +" years old \n i came from "+ country);
    }
    public void Checkcountry(){
        System.out.println("Country : " + this.country);
    }
    public void Iscanfly(){
        int check = this.canfly;
        if(check == 1){
            System.out.println("Can fly : true");
        }else{
            System.out.println("Can fly : false");
        }
    }
}
