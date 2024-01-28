public class Players extends Person {
    private double money;

    public Players(String firstName, String lastName, double money) {
        super(firstName, lastName);
        this.money = 1000;
    }

    public Players(String firstName, double money) {
        super(firstName);
        this.money = 1000;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + ": $" + money;
    }
}