package Week9;

public class Testoverride1 {
    public static void main(String[] args){

        Person person1;
        person1 = new Person("Mark",2001);
        person1.introduce();

        Person person2;
        person2 = new Sheriff("Mateo",1988,"California");
        person2.introduce();

        Person person3;
        person3 = new Teacher("Ball",1977,"CMU");
        person3.introduce();
        
        Person person4;
        person4 = new PrimeMinister("Tu",1987,"Thailand");
        person4.introduce();
        
        Person person5;
        person5 = new footballplayer("Messi",1987,"Barcelona");
        person5.introduce();
        
        Person person6;
        person6 = new Me("Gunn",2001,"CMU");
        person6.introduce();
    }
}
