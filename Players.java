public class Players {
    private String name;

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean makeGuess(int guess) {
        return false;
    }

    public void addMoney(int winnings) {
        throw new UnsupportedOperationException("Unimplemented method 'addMoney'");
    }

    public String getMoney() {
        throw new UnsupportedOperationException("Unimplemented method 'getMoney'");
    }

    public void guess() {
        throw new UnsupportedOperationException("Unimplemented method 'guess'");
    }
}
