package learn.advanced.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  private static final int MINIMUM_NUMBER = 1;
  private static final int MAXIMUM_NUMBER = 100;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random generateRandomNumber = new Random();
    int userAttempt = 1;
    int userInput;

    int randomNumber = generateRandomNumber.nextInt(MINIMUM_NUMBER ,MAXIMUM_NUMBER + 1);

    System.out.printf("Guess the number between %s to %s :%n", MINIMUM_NUMBER, MAXIMUM_NUMBER);

    do {
      validateInputMustBeNumber(scanner);

      userInput = validateInputNumber(scanner);

      if (userInput > randomNumber) {
        System.out.println("Try guessing lower number");
      }

      if (userInput < randomNumber) {
        System.out.println("Try guessing higher number");
      }

      if (userInput == randomNumber) {
        System.out.println("CORRECT!!");
        System.out.println("The number is " + randomNumber);
        System.out.println("You're guessing in " + userAttempt + " attempts.");
      }

      userAttempt++;
    } while (userInput != randomNumber);

    scanner.close();
  }

  private static void validateInputMustBeNumber(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.println("Only number allowed!");
      scanner.next();
    }
  }

  private static int validateInputNumber(Scanner scanner) {
    int input = scanner.nextInt();
    while (input < MINIMUM_NUMBER || input > MAXIMUM_NUMBER) {
      System.out.printf("Input number must be between %s to %s. %n", MINIMUM_NUMBER, MAXIMUM_NUMBER);
      input = scanner.nextInt();
    }

    return input;
  }
}
