package Abstract;

public class CreditCardPayment extends Odeme {
    private double kdvTutari;

    CreditCardPayment() {
        // Hata almamak icin
    }

    CreditCardPayment(String musteriAdi, double islemTutari, double kdvTutari) {
        super(musteriAdi, islemTutari);
        if (kdvTutari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.kdvTutari = kdvTutari;
        }
    }

    double getKdvTutari() {
        return this.kdvTutari;
    }

    void setKdvTutari(double kdvTutari) {
        if (kdvTutari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.kdvTutari = kdvTutari;
        }
    }

    @Override
    void odeme() {
        System.out
                .println(super.getMusteriAdi() + " Adli kullanicinin islem tutari: " + super.getIslemTutari() + "'dir");
        System.out.println(
                "KDV eklenmis toplam tutar ise: " + (super.getIslemTutari() + (super.getIslemTutari() * kdvTutari)));

    }
}
