package Week7;

public class Fish extends Pet {
    int size;
    String watertype;
    int speed;
    public void FishInf(int age,String name,String color , String species ,int size, String watertype , int speed){
        this.age = age;
        this.species = species;
        this.color = color;
        this.name = name;
        this.size = size;
        this.watertype = watertype;
        this.speed = speed;
    }
    public void isSwimtothesea(){
        String watertype = this.watertype;
        if(watertype.equals("salt")){
            System.out.println("My fish "+ name+"is swimming to the sea");
        }else{
            System.out.println("My fish "+ name+" is not swimming to the sea");
        }
    }
    public void Swimfast(){
        int speed  = this.speed;
        if(speed == 1){
            System.out.println("Swimfast : true");
        }else{
            System.out.println("Swimfast : false");
        }
    }
}
