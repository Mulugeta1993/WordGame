import java.util.Scanner;

public class Turn {
<<<<<<< Updated upstream
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
=======
  public char getPlayerGuess() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a letter: ");
      char letter = scanner.next().charAt(0);
      return letter;
    }
  }

  public boolean takeTurn(Players players, Host host) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'takeTurn'");
  }
}
>>>>>>> Stashed changes
