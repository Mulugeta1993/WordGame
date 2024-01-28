import java.util.Random;

public class Hosts extends Person {
    private Numbers numbers;

    public Hosts() {
        super();
        numbers = new Numbers();
    }

    public void randomizeNum() {
        numbers.generateNumber();
    }

    public int getRandomNum() {
        return numbers.getNumToGuess();
    }
}