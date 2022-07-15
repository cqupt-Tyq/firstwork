package Analyze;

public class CardLost extends Lost{
    int cardNumber;
    public int getCardNumber() {
        return cardNumber;
    }

    public Lost setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        return null;
    }
    @Override
    public String toString() {
        return year +
                ","+month +
                "," + day +
                "," +cardNumber+
                ","+where
                ;
    }
}
