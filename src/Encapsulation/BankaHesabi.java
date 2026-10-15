package Encapsulation;

import java.util.Random;

class BankaHesabi {
    private String hesapSahibi;
    private int hesapNumarasi;
    private double bakiye;
    private Integer[] hesapNumaralari = new Integer[500];
    private static int sayac = 0;

    BankaHesabi(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        if (bakiye < 0) {
            try {
                throw new NegatifBakiye();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.bakiye = bakiye;
        }
        this.hesapNumarasi = HesapNumarasiAtama();
        sayac++;
    }

    BankaHesabi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = 0;
        this.hesapNumarasi = HesapNumarasiAtama();
        sayac++;
    }

    String getHesapSahibi() {
        return this.hesapSahibi;
    }

    void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    double getBakiye() {
        return this.bakiye;
    }

    void setBakiye(double bakiye) {
        if (bakiye < 0) {
            try {
                throw new NegatifBakiye();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.bakiye = bakiye;
        }
    }

    int getHesapNumarasi() {
        return this.hesapNumarasi;
    }

    int HesapNumarasiAtama() {
        // Hesap numarasi 6 haneli olmali
        Random rand = new Random();
        this.hesapNumarasi = rand.nextInt(900000) + 100000;
        int i = sayac;
        boolean sonuc = false;
        while (true) {
            if (i == -1) {
                break;
            }
            if (hesapNumaralari[i] == this.hesapNumarasi) {
                sonuc = true;
                break;
            }
            if (hesapNumaralari[i] == null) {
                break;
            }
            i--;
        }
        if (sonuc == true) {
            HesapNumarasiAtama();
        }

        return this.hesapNumarasi;
    }

}
