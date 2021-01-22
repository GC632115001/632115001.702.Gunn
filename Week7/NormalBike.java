package Week7;

public class NormalBike extends Bicycle{
    public NormalBike(int speed) {
        this.speed = speed; 
    }
    public void acceleration(int accel){
        speed = speed + accel;
        if(speed>99){
            System.out.println("Speed limit reached");
        }else{
            System.out.println("Current speed : " + speed);
        }
    }
    public void braking(int brake){
        speed = speed- brake;
        System.out.println("Current speed : "+ speed);
    }
}
