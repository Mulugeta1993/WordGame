import java.util.Scanner;

public class Turn {
  public void playTurn() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a letter to guess:");
      String guess = scanner.next();

      try {
        Object Phrases;
        ((Object) Phrases).findLetters(guess);
      } catch (Exception e) {
        System.out.println("Please enter a valid letter.");
      }
    }
  }
}
