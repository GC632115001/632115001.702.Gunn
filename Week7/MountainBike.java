package Week7;

public class MountainBike extends Bicycle{
    int gear;
    public MountainBike(int speed) {
        this.speed = speed; 
    }
    public void currentGear(int gear){
        this.gear=gear;
    }
    public void acceleration(int accel){
        speed = speed + (gear*accel);
        if(speed>99){
            System.out.println("Speed limit reached");
        }else{
            System.out.println("Current speed : " + speed);
        }
    }
}
