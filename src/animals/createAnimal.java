package animals;

import java.util.Scanner;


public class createAnimal {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAnimal create = new createAnimal();
        create.getAnimalType();
    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create");
        String animal = myScanner.nextLine();


        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create, please try again");
        }
    }

    private void createDog() {
        System.out.println("What is the dog's name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);
    }


    private void createCat() {
        System.out.println("What is the cat's name?");
        String name = myScanner.nextLine();
        System.out.println("How old is the cat?");
        int age = myScanner.nextInt();
        System.out.println("How much does the cat weigh?");
        float weight = myScanner.nextFloat();
        System.out.println("Is the cat awake?");
        Boolean awake = myScanner.nextBoolean();

        cat myCat = new cat(name, age, weight, awake);

        myCat.play(awake);
        myCat.beHuman(name, age, awake);
    }


}

