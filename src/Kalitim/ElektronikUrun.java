package Kalitim;

public class ElektronikUrun extends Urun {
    private int garantiSuresiAy;
    private int voltaj;

    ElektronikUrun() {
        // Hata almamak icin
    }

    ElektronikUrun(String barkod, String ad, double fiyat, int stokMiktari, int garantiSuresiAy, int voltaj) {
        super(barkod, ad, fiyat, stokMiktari);
        if (garantiSuresiAy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.garantiSuresiAy = garantiSuresiAy;
        }
        if (voltaj < 0) {
            throw new IllegalArgumentException();
        } else {
            this.voltaj = voltaj;
        }
    }

    int getGarantiSuresiAy() {
        return this.garantiSuresiAy;
    }

    void setGarantiSuresiAy(int garantiSuresiAy) {
        if (garantiSuresiAy < 0) {
            throw new IllegalArgumentException();
        } else {
            this.garantiSuresiAy = garantiSuresiAy;
        }
    }

    int getVoltaj() {
        return this.voltaj;
    }

    void setVoltaj(int voltaj) {
        if (voltaj < 0) {
            throw new IllegalArgumentException();
        } else {
            this.voltaj = voltaj;
        }
    }

}
