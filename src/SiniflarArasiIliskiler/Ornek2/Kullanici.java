
package SiniflarArasiIliskiler.Ornek2;

import java.util.Scanner;

class Kullanici {
    private String ad;
    private String yetki;

    Kullanici() {
        // Hata almamak icin
    }

    Kullanici(String ad, String yetki) {
        this.ad = ad;
        this.yetki = yetki;
    }

    String getKullaniciAdi() {
        return this.ad;
    }

    void setKullaniciAdi(String ad) {
        this.ad = ad;
    }

    String getKullaniciYetkisi() {
        return this.yetki;
    }

    void setKullaniciYetkisi(String yetki) {
        this.yetki = yetki;
    }

    void klimayiCalistir(Klima klima) {
        klima.setKlimaCalismaDurumu(true);
    }

    void klimayiKapat(Klima klima) {
        klima.setKlimaCalismaDurumu(false);
    }

    void dereceAyarla(Klima klima) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kac derece olsun istiyorsunuz?");
        double sicaklikGirdisi = girdi.nextDouble();
        klima.setKlimaSicaklikDerecesi(sicaklikGirdisi);
    }

}
