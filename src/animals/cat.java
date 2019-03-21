package animals;

public class cat {

    private String name;
    private int age;
    private float weight;
    private boolean awake;

    public cat(String name, int age, float weight, boolean awake){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.awake = awake;

    }

    public String eat( float weight){
        String eating = "";
        if (weight < 5) {
            eating = "klklk";
        }
         else if (weight > 5 || weight < 10){
             eating = "sgsgsg";
        }
         else {
             eating = "ggggg";
        }

         return eating;
    }

    public String play(Boolean awake){
        String playing = "";

        if(this.awake){
            playing = "Let's go!";
        }

        else {
            playing = "Zzzzz....";
        }

        return playing;
    }

    public String beHuman(String name, int age, boolean awake) {
        String status = "";
        if (awake){
             status = "awake and ready to play!";
        }
        else { status = "asleep, leave me alone.";}

        return "Hello, my name is " + name + " and I am a " + age + " year old cat and I am " + status;
    }
}
