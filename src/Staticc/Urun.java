package Staticc;

public class Urun {
    private static String magazaAdi = "Teknoloji Dünyası";
    private static int toplamUrunSayisi = 0;
    private String urunAdi;
    private double fiyat;

    Urun() {
        // Hata almamak icin
    }

    Urun(String urunAdi, double fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        toplamUrunSayisi++;
    }

    // yüzde olarak indirim yapar
    void indirimYap(double indirimOrani) {
        indirimOrani = (indirimOrani / 100);
        fiyat = fiyat - (fiyat * indirimOrani);
        System.out.println("Fiyat: " + fiyat);
    }

    // hem yüzde hem de sabit bir tutar indirimi yapar
    void indirimYap(double indirimOrani, double tutar) {
        indirimOrani = (indirimOrani / 100);
        fiyat = fiyat - (fiyat * indirimOrani) - tutar;
        System.out.println("Fiyat: " + fiyat);
    }

    static void toplamUrunSayisiGoster() {
        System.out.println(Urun.toplamUrunSayisi);
    }

}
