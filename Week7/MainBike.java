package Week7;
//632115001 Gunn Chochuwong
public class MainBike {
    public static void main(String [] args){
        //normal 
        NormalBike bike1 =  new NormalBike(10);
        bike1.checkSpeed();
        bike1.acceleration(4);
        bike1.braking(4);
        //mountian
        MountainBike bike2 = new MountainBike(4);
        bike2.currentGear(2);
        bike2.checkSpeed();
        bike2.acceleration(5);

    }
}
