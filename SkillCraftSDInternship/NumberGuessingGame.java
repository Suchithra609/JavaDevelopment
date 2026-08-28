package SkillCraftSDInternship;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;
            if (guess == number) {
                System.out.println("Congratulations!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }
        sc.close();
    }
}