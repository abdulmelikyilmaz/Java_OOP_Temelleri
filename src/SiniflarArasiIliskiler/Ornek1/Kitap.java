package SiniflarArasiIliskiler.Ornek1;

public class Kitap {
    private String kitapAd;
    private int sayfaSayisi;
    private Yazar yazar;

    Kitap() {
        // Hata almamak icin
    }

    Kitap(String kitapAd, int sayfaSayisi, Yazar yazar) {
        this.kitapAd = kitapAd;
        if (sayfaSayisi < 0) {
            try {
                throw new NegatifDeger();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
        this.yazar = yazar;
    }

    String getKitapAd() {
        return this.kitapAd;
    }

    void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }

    int getSayfaSayisi() {
        return this.sayfaSayisi;
    }

    void setSayfaSayisi(int sayfaSayisi) {
        if (sayfaSayisi < 0) {
            try {
                throw new NegatifDeger();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }

    public Yazar getYazar() {
        return this.yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

}
