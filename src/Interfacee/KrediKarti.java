package Interfacee;

import java.util.Random;

public class KrediKarti extends OdemeYontemi implements IadeEdilebilir, GuvenlikliOdeme {
    private int aktifSmsKodu;

    public KrediKarti(double tutar, String islemTarihi, String musteriAdi) {
        super(tutar, islemTarihi, musteriAdi); // Eğer üst sınıfta (OdemeYontemi) bu alanları alan bir constructor varsa
                                               // super
        // ile çağırırsın
    }

    void islemGerceklestir() {
        System.out.println("Kredi karti ile islem basarili sekilde gerceklestirildi");
    }

    int kodOlusturma() {
        Random rand = new Random();
        aktifSmsKodu = rand.nextInt(900000) + 100000;
        return aktifSmsKodu;
    }

    @Override
    public void iadeEt() {
        System.out.println("İade islemi gerceklestirildi");
    }

    @Override
    public String smsKoduGonder() {
        return "Sms kodu gonderildi!";
    }

    public boolean dogrula(int kod) {
        if (kod == aktifSmsKodu) {
            return true;
        } else {
            return false;
        }
    }
}
