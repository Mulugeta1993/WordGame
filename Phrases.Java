import java.util.ArrayList;
import java.util.List;

public class Phrases {
    private static String gamePhrase;
    private static String playingPhrase;

    public static void setGamePhrase(String phrase) {
        gamePhrase = phrase;
        initializePlayingPhrase();
    }

    private static void initializePlayingPhrase() {
        playingPhrase = gamePhrase.replaceAll("[a-zA-Z]", "_");
    }

    public static String getPlayingPhrase() {
        return playingPhrase;
    }

    public static void findLetters(String letter) throws MultipleLettersException {
        if (letter.length() != 1) {
            throw new MultipleLettersException("Please enter only one letter at a time.");
        }

        char charToFind = letter.charAt(0);
        char[] gamePhraseChars = gamePhrase.toCharArray();
        char[] playingPhraseChars = playingPhrase.toCharArray();

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < gamePhraseChars.length; i++) {
            if (Character.toLowerCase(gamePhraseChars[i]) == Character.toLowerCase(charToFind)) {
                indices.add(i);
            }
        }

        if (indices.isEmpty()) {
            System.out.println("Letter not found in the phrase.");
        } else {
            for (int index : indices) {
                playingPhraseChars[index] = gamePhraseChars[index];
            }

            playingPhrase = String.valueOf(playingPhraseChars);
            System.out.println("Updated phrase: " + playingPhrase);

            if (!playingPhrase.contains("_")) {
                System.out.println("Congratulations! You have guessed the phrase correctly. You win!");
                // Award a prize
            }
        }
    }
}

class MultipleLettersException extends Exception {
    public MultipleLettersException(String message) {
        super(message);
    }