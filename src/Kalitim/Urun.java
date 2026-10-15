package Kalitim;

public class Urun {
    private String barkod;
    private String ad;
    private double fiyat;
    private int stokMiktari;
    private static int toplamUrunSayisi = 0;
    public static final double KDV_ORANI = 0.20;

    Urun() {
        // Hata almamak icin
        toplamUrunSayisi++;
    }

    Urun(String barkod, String ad, double fiyat, int stokMiktari) {
        this.barkod = barkod;
        this.ad = ad;
        if (fiyat < 0) {
            throw new IllegalArgumentException();
        } else {
            this.fiyat = fiyat;
        }
        if (stokMiktari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.stokMiktari = stokMiktari;
        }
        toplamUrunSayisi++;
    }

    String getBarkod() {
        return this.barkod;
    }

    void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    String getAd() {
        return this.ad;
    }

    void setAd(String ad) {
        this.ad = ad;
    }

    double getFiyat() {
        return this.fiyat;
    }

    void setFiyat(double fiyat) {
        if (fiyat < 0) {
            throw new IllegalArgumentException();
        } else {
            this.fiyat = fiyat;
        }
    }

    int getStokMiktari() {
        return this.stokMiktari;
    }

    void setStokMiktari(int stokMiktari) {
        if (stokMiktari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.stokMiktari = stokMiktari;
        }
    }

    static int getToplamUrunSayisi() {
        return toplamUrunSayisi;
    }

}
