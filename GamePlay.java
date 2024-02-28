import java.util.Scanner;

public class GamePlay {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Welcome to the Game!");

    boolean continueGame = true;
    while (continueGame) {
      System.out.print("Enter a letter to guess: ");
      String guess = scanner.nextLine();

<<<<<<< Updated upstream
      try {
        Phrases.findLetters(guess);
      } catch (MultipleLettersException e) {
        System.out.println(e.getMessage());
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid letter.");
=======
      Host host = new Host();

      host.randomizeNum();

      Turn turn = new Turn();
      for (int i = 0; i < game.currentPlayers.length; i++) {
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Would you like to enter a last name? (yes/no): ");
        String answer = input.nextLine();

        if (answer.equals("yes")) {
          System.out.print("Enter your last name: ");
          String lastName = input.nextLine();
          game.currentPlayers[i] = new Players(name, lastName);
        } else {
          game.currentPlayers[i] = new Players(name);
        }
        game.currentPlayers[i].setMoney(1000);
>>>>>>> Stashed changes
      }

      System.out.print("Continue playing? (Y/N): ");
      String playChoice = scanner.nextLine();
      if (!playChoice.equalsIgnoreCase("Y")) {
        continueGame = false;
      }
    }
  }
}
