package inheritance;

public class Vehicle {

    public short numberOfSeats;
    public short numberOfWheels;


    public void accelerate(){
        System.out.println("I accelerate by turning my wheels!");
    }

    public void brake(){
        System.out.println("I brake by applying pressure to brake discs on my wheels.");
    }

    public void steer(){
    }
}
