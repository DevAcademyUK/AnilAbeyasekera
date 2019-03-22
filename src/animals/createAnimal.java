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
        System.out.println("How big (small, medium or large) is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old (years) is the dog?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("What breed (Poodle, Golden Retriever, Border Collie) is the dog?");
        String breed = myScanner.nextLine();

        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);

        System.out.println(myDog.bark(size));
        System.out.println(myDog.play(breed));
        System.out.println(myDog.beHuman(name, age, breed));

        getAnimalType();
    }


    private void createCat() {
        System.out.println("What is the cat's name?");
        String name = myScanner.nextLine();
        System.out.println("How old is the cat (years)?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("How much does the cat weigh (kilograms)?");
        float weight = myScanner.nextFloat();
        System.out.println("Is the cat awake (true or false)?");
        boolean awake = myScanner.nextBoolean();

        cat myCat = new cat(name, age, weight, awake);

        myCat.play(awake);
        myCat.beHuman(name, age, awake);

        System.out.println(myCat.play(awake));
        System.out.println(myCat.beHuman(name, age, awake));

        getAnimalType();
    }


}

