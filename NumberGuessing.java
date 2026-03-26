import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain = 'y';
        while (playAgain == 'y' || playAgain == 'Y') {
            int number = random.nextInt(100) + 1;
            int guess = 0;
            System.out.println("\nWelcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100");
            while (guess != number) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Too Low! Try again.");
                } 
                else if (guess > number) {
                    System.out.println("Too High! Try again.");
                } 
                else {
                    System.out.println("Congratulations! You guessed the correct number.");
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}