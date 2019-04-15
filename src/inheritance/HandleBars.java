package inheritance;

public class HandleBars extends Vehicle {
    public void steer(String dir){
        System.out.println("I can turn " + dir +
                " by turning my handlebars " + dir
                + " and leaning");
    }
}
