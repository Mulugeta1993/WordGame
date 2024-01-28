import java.util.Scanner;

public class Turn {
    private Scanner sc;

    public Turn() {
        sc = new Scanner(System.in);
    }

    public boolean takeTurn(Players player, Hosts host) {
        System.out.println(host.getFirstName() + " " + host.getLastName() + " says \"" + player.getFirstName() + " " + player.getLastName() + ", enter your guess for my random number between 0 and 100\"");
        int guess = sc.nextInt();
        if (guess == host.getRandomNum()) {
            player.setMoney(player.getMoney() + 1000);
            System.out.println("Congratulations, you guessed the number!");
            System.out.println("You win $1000.00");
            System.out.println(player.toString());
            return true;
        } else if (guess > host.getRandomNum()) {
            player.setMoney(player.getMoney() - 200);
            System.out.println("I'm sorry. That guess was too high.");
            System.out.println("You lose $200.00");
            System.out.println(player.toString());
        } else {
            player.setMoney(player.getMoney() - 200);
            System.out.println("I'm sorry. That guess was too low.");
            System.out.println("You lose $200.00");
            System.out.println(player.toString());
        }
        return false;
    }
}