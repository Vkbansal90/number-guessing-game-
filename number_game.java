import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1;
        while(true){
        System.out.println("Enter your guess between 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int playerguess = scanner.nextInt();
        if (playerguess == randomnumber) {
            System.out.println("You win!");
            break ;
        } else if (randomnumber>playerguess){
            System.out.println("You lose . Number is higher than your guess");
        }else{System.out.println("You lose . Number is lower than your guess");
        }
    }}
}