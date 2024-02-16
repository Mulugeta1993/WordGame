import java.util.Random;

interface Award {
  void displayWinnings(boolean hasWon, String playerName);
}

class Physical implements Award {
  private String[] physicalPrizes = { "Car", "Vacation Package", "Smartphone", "Kitchen Appliances",
      "Fitness Equipment" };

  public int getRandomPrize() {
    Random random = new Random();
    return random.nextInt(physicalPrizes.length);
  }

  @Override
  public void displayWinnings(boolean hasWon, String playerName) {
    int prizeIndex = getRandomPrize();
    if (hasWon) {
      System.out.println(playerName + " has won!");
      System.out.println("Congratulations! You have won a " + physicalPrizes[prizeIndex]);
    } else {
      System.out.println(playerName + " has lost.");
      System.out.println("You could have won a " + physicalPrizes[prizeIndex]);
    }
  }
}
