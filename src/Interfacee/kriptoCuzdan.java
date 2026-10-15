package Interfacee;

public class kriptoCuzdan extends OdemeYontemi implements IadeEdilebilir {

    kriptoCuzdan(double tutar, String islemTarihi, String musteriAdi) {
        super(tutar, islemTarihi, musteriAdi);
    }

    public void islemGerceklestir() {
        System.out.println("Kripto odeme islem gerceklesti");
    }

    public void iadeEt() {
        System.out.println("Iade basarili");
    }
}
