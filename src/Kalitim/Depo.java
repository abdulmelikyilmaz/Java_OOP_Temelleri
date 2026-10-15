package Kalitim;

public class Depo {
    private String depoAdi;
    private Urun[] urun;
    private int kapasite;
    private int mevcutElemanSayisi = 0;

    Depo() {
        // Hata almamak icin
    }

    Depo(String depoAdi, int kapasite) {
        this.depoAdi = depoAdi;
        if (kapasite < 0) {
            throw new IllegalArgumentException();
        } else {
            this.kapasite = kapasite;
        }
        this.urun = new Urun[kapasite];
    }

    String getDepoAdi() {
        return this.depoAdi;
    }

    void setDepoAdi(String depoAdi) {
        this.depoAdi = depoAdi;
    }

    int getKapasite() {
        return this.kapasite;
    }

    public void urunEkleme(Urun urunum) {
        if (mevcutElemanSayisi < kapasite) {
            urun[mevcutElemanSayisi] = urunum;
            mevcutElemanSayisi++;
            System.out.println(urunum.getAd() + " depoya eklendi");
        } else {
            System.out.println("Deponun kapasitesi yetersiz.");
        }
    }

    public void urunleriListele() {
        System.out.println("--- Depodaki Ürünler ---");
        for (int i = 0; i < mevcutElemanSayisi; i++) {
            // Dizideki ürünlerin bilgilerini yazdırıyoruz
            System.out.println("- Ürün Adı: " + urun[i].getAd() + ", Fiyatı: " + urun[i].getFiyat() + " TL");
        }
    }

}
