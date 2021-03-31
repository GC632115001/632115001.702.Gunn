package Week9;
public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce(){
        System.out.print("My name is "+name+",");
        System.out.println("I was born in "+ bornYear +",");
    }
}
class Sheriff extends Person {
    String workState;

    public Sheriff(String name, int bornYear , String workState){
        super(name,bornYear);
        this.workState = workState;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff an work in "+workState+".");
    }
}
class Teacher extends Person{
    String university;

    public Teacher(String name, int bornYear , String university){
        super(name,bornYear);
        this.university = university;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach the students in "+university+".");
    }
}
class PrimeMinister extends Person{
	String country;

	public PrimeMinister(String name, int bornYear, String country) {
		super(name, bornYear);
		this.country = country;
	}
	public void introduce(){
        super.introduce();
        System.out.println("I'm a prime minister and i work in "+country+".");
    }
}
class footballplayer extends Person{
    String club;

	public footballplayer(String name, int bornYear, String club) {
		super(name, bornYear);
		this.club = club;
	}
	public void introduce(){
        super.introduce();
        System.out.println("I'm a football player and i work in "+club+"football club.");
    }
}
class Me extends Person{
    String university;

    public Me(String name, int bornYear , String university){
        super(name,bornYear);
        this.university = university;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and i study at "+university+".");
    }
}
