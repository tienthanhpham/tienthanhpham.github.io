package vn.techmaster.reservation;

public class Card {
    private String cardNumber;
    private int balance;
    private boolean eligible;

    public Card(String cardNumber, int balance, boolean eligible) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.eligible = eligible;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public void deduct(int amount) {
        if (balance < amount)
            throw new IllegalArgumentException("So du ko du");
        balance -= amount;
    }
}
