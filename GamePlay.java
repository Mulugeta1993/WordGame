import java.util.Scanner;

public class GamePlay {
  private Players[] currentPlayers;

  public GamePlay() {
    currentPlayers = new Players[3];
  }

  public void startGame() {
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < currentPlayers.length; i++) {
        System.out.print("Enter player " + (i + 1) + " name: ");
        String playerName = scanner.nextLine();
        currentPlayers[i] = new Players(playerName);
      }
    }
    int currentPlayerIndex = 0;
    while (true) {
      Players currentPlayer = currentPlayers[currentPlayerIndex];
      currentPlayer.guess();

      currentPlayerIndex++;
      if (currentPlayerIndex >= currentPlayers.length) {
        currentPlayerIndex = 0;
      }
    }
  }

  public static void main(String[] args) {
    GamePlay game = new GamePlay();
    game.startGame();
  }
}
