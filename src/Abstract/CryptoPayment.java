package Abstract;

public class CryptoPayment extends Odeme {
    private double islemUcreti;

    CryptoPayment() {
        // Hatadan kactik
    }

    CryptoPayment(String musteriAdi, double islemTutari) {
        super(musteriAdi, islemTutari);
    }

    double islemUcreti() {
        islemUcreti = getIslemTutari() * (0.01);
        return islemUcreti;
    }

    @Override
    void odeme() {
        islemUcreti = (getIslemTutari() * (0.01));
        System.out.println(super.getMusteriAdi() + " adli kullanicinin islem tutari: " + super.getIslemTutari());
        System.out.println("İslem ucreti ehsaplanmis hali: " + (getIslemTutari() + islemUcreti));
    }

}
