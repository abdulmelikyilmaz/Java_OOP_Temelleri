package Interfacee;

public class HediyeKarti extends OdemeYontemi {
    HediyeKarti(double tutar, String islemTarihi, String musteriAdi) {
        super(tutar, islemTarihi, musteriAdi);
    }

    @Override
    public void islemGerceklestir() {
        System.out.println("Hediye karti tanimlandi");
    }
}
