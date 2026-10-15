package Interfacee;

public abstract class OdemeYontemi {
    private double tutar;
    private String islemTarihi;
    private String musteriAdi;
    private static int sayac = 0;

    OdemeYontemi() {
        this(0, "", "");// Ana kurucu metodu cagirdik
    }

    OdemeYontemi(double tutar, String islemTarihi, String musteriAdi) {
        if (tutar < 0) {
            throw new IllegalArgumentException();
        } else {
            this.tutar = tutar;
        }
        this.islemTarihi = islemTarihi;
        this.musteriAdi = musteriAdi;
        sayac++;
    }

    double getTutar() {
        return this.tutar;
    }

    void setTutar(double tutar) {
        if (tutar < 0) {
            throw new IllegalArgumentException();
        } else {
            this.tutar = tutar;
        }
    }

    String getIslemTarihi() {
        return this.islemTarihi;
    }

    void setIslemTarihi(String islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    String getMusteriAdi() {
        return this.musteriAdi;
    }

    void setMusteriAd(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    abstract void islemGerceklestir();

}
