package learn.advanced.RockPaperScissors;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int totalPlayerWin = 0;
    int totalPlayerLosses = 0;

    System.out.println("Welcome to Rock-Paper-Scissors! Please enter \"rock\", \"paper\", \"scissors\", or \"quit\" to exit.");

    while (true) {
      System.out.println("Choose a move :");
      String playerMove = scanner.next();

      // Akhiri permainan ketika player input "quit"
      if (playerMove.equalsIgnoreCase("quit")) {
        System.out.println("You won " + totalPlayerWin + " times and lost " + totalPlayerLosses + " times.");
        System.out.println("Thanks for playing! See you again.");
        break;
      }

      // Cek jika inputan player tidak valid
      boolean isMoveValid = Arrays.stream(Move.values()).anyMatch(move -> playerMove.equalsIgnoreCase(move.getValue()));
      if (!isMoveValid) {
        System.out.println("Move is invalid!");
        continue;
      }

      // Mengambil pilihan dari computer
      String computerMove = getComputerMove(random);

      // Cek apakah player menang atau kalah melawan computer
      if (playerMove.equalsIgnoreCase(computerMove)) {
        System.out.println("It's a draw!");
      } else if (isPlayerWin(playerMove, computerMove)) {
        System.out.println("Player wins!");
        totalPlayerWin++;
      } else {
        System.out.println("Computer wins!");
        totalPlayerLosses++;
      }
    }

    scanner.close();
  }

  // Method untuk mendapatkan pilihan dari computer
  private static String getComputerMove(Random random) {
    int randomNumber = random.nextInt(3);
    String computerMove = Move.values()[randomNumber].getValue();
    System.out.println("Computer choose : " + computerMove);

    return computerMove;
  }

  // Method untuk mengecek apakah player menang atau tidak
  private static boolean isPlayerWin(String playerMove, String computerMove) {
    if (playerMove.equalsIgnoreCase(Move.ROCK.getValue())) {
      return computerMove.equalsIgnoreCase(Move.SCISSORS.getValue());
    } else if (playerMove.equalsIgnoreCase(Move.PAPER.getValue())) {
      return computerMove.equalsIgnoreCase(Move.ROCK.getValue());
    } else {
      return computerMove.equalsIgnoreCase(Move.PAPER.getValue());
    }
  }
}

