package Week7;
//632115001 Gunn Chochuwong
public class Store {
    public static void main(String[]args) {
        Dog pet1 = new Dog();
        // the last one is size there are 3 types and each corelates with each type of barks and shorthair
        //1 is for small
        //2 is for medium
        //3 is for large
        pet1.DogInf(2,"Lucky","Brown","Poodle",1);
        pet1.showPetData();
        pet1.Run();
        pet1.Bark();
        pet1.isshortHair();
        //this one size does not corelates to speed 
        //there is only 2 types of speed 1 is for fast and other numbers are for slow
        Fish pet2 = new Fish();
        pet2.FishInf(1 , "joker", "orange with white stripes","clown fish" , 1, "salt" , 1);
        pet2.showPetData();
        pet2.isSwimtothesea();
        pet2.Swimfast();
        //the last one is for flight 
        //1 is for able to fly other number for not able to fly
        Bird pet3 = new Bird();
        pet3.BirdInf(5 , "Polly", "black with yellow beak", "toucan", "Brazil", 1);
        pet3.Speak();
        pet3.Checkcountry();
        pet3.Iscanfly();
    }
}
