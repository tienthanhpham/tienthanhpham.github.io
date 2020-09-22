package vn.techmaster;

public class CardNumber {
    //"Ace, 2, 3, --> K"
    //Co Ro Tep Bich
    //Sinh ra ngau nhien 1 so tu 1-52
    // Kiem tra so ngau nhien nay random
    // Neu ma random % 13 == 1 --> Ace
    // Du 12 --> Q, Du 11 --> J, Du 0 --> K, Du random --> random
    // random / 13
    private String number;
    private int random;

    public int getRandom() {
        return random;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber() {
        random = (int)(Math.random()*52) + 1;
        if (random % 13 == 1)
            number = "Ace";
        else if (random % 13 == 12)
            number = "Q";
        else if (random % 13 == 11)
            number = "J";
        else if (random % 13 == 0)
            number = "K";
        else
            number = Integer.toString(random % 13);
    }
}
