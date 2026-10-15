package Abstract;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment("Melik", 1500, 0.2);
        c.odeme();
        CryptoPayment c2 = new CryptoPayment("Ali", 1500);
        c2.odeme();
    }
}
