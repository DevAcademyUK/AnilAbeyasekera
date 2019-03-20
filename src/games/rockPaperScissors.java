package games;

        import java.util.Random;
        import java.util.Scanner;

public class rockPaperScissors {

    // these strings are accessible any from anywhere within the programme where it is called
    String playerName; //define string variables
    String playerMove;
    String computerMove;
    int score; // define the total for wins or losses as an integer
    Scanner myScanner = new Scanner(System.in); // create scanner variable

    public static void main(String[] args){ // main method
        rockPaperScissors rps = new rockPaperScissors();
        rps.initialiseGame();
    }


    private void initialiseGame(){ // private means these can only be accessed by the rockPaperScissors class
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine(); // uses scanner to input into playerName
        playGame(); // method
    }

    private void playGame(){ // void implies there is no return value from this method
        System.out.println("Enter your move: "); // inputs move
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move"); // outputs move
        computerMove = generateComputerMove();
        String result = getWinner(playerMove, computerMove);
        if(result.equalsIgnoreCase("Win")){
            System.out.println("Congratulations, you won this round!"); // prints result
            score++; // increase score by 1 unit
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--; // decrease score by 1 unit
        }
        else {
            System.out.println("This round was a draw!"); //print string and dont change score
        }

        if(score < 3 && score > -3){ // loops the game until the score variable reaches 3 or -3
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!"); //end conditions for win
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!"); //end conditions for lose
        }

    }

    private String generateComputerMove() {
        Random r = new Random(); // generate new random variable r
        String move = "";
        int i = r.nextInt(3); // generates an integer from 0, 1, 2 (range 3) as computer move
        switch(i){
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove){ // creates string variable with playerMove and computerMove variables
        String outcome = ""; // determines outcome for each combination
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){ // compares strings playerMove and computerMove and sets them as a string
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome; //returns the outcome string then loops to check score
    }
}
