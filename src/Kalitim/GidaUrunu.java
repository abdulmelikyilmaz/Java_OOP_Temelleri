package Kalitim;

public class GidaUrunu extends Urun {
    private String sonKullanimTarihi;
    private boolean sogukZincirGerekliMi;

    GidaUrunu() {
        // Hata almamak icin
    }

    GidaUrunu(String barkod, String ad, double fiyat, int stokMiktari, String sonKullanimTarihi,
            boolean sogukZincirGerekliMi) {
        super(barkod, ad, fiyat, stokMiktari);
        this.sonKullanimTarihi = sonKullanimTarihi;
        this.sogukZincirGerekliMi = sogukZincirGerekliMi;
    }

    String getSonKullanimTarihi() {
        return this.sonKullanimTarihi;
    }

    void setSonKullanimTarihi(String sonKullanimTarihi) {
        this.sonKullanimTarihi = sonKullanimTarihi;
    }

    boolean getSogukZincirGerekliMi() {
        return this.sogukZincirGerekliMi;
    }

    void setSogukZincirGerekliMi(boolean sogukZincirGerekliMi) {
        this.sogukZincirGerekliMi = sogukZincirGerekliMi;
    }

}
