package Overloading;

import javax.swing.text.MaskFormatter;

public class Overloading {

    public static void main(String[] args) {
        System.out.println("Sonuç (Toplam Geri Ödeme): " + krediHesapla(1000, 50));
    }

    static double krediHesapla(int anaPara, int vadeAy) {
        System.out.println("[Bilgi] Standart İhtiyaç Kredisi hesaplanıyor (Aylık %1.5 sabit faiz)...");
        return anaPara + (anaPara * 0.015 * vadeAy);
    }

    static double krediHesapla(double anaPara, double aylikFaizOrani, int vadeAy) {
        System.out.println("[Bilgi] Özel Faiz Oranlı Kredi hesaplanıyor (Özel faiz: " + aylikFaizOrani + ")...");
        return anaPara + (anaPara * aylikFaizOrani * vadeAy);
    }

    static double krediHesapla(String musteriTipi, double anaPara, int vadeAy) {
        musteriTipi = musteriTipi.toUpperCase();
        System.out.println("[Bilgi] Müşteri Segmentli Kredi hesaplanıyor. Segment: " + musteriTipi);
        double faiz = 0.012;
        if (musteriTipi.equals("VIP")) {
            faiz *= 0.8;
        }
        return anaPara + (anaPara * faiz * vadeAy);
    }

    static double krediHesapla(double anaPara, int vadeAy, double... ekMasraflar) {
        System.out.println("[Bilgi] Ek Masraflı / Esnek Kredi (Varargs) hesaplanıyor...");
        double anaBorc = anaPara + (anaPara * vadeAy * 0.011);
        for (double masraflar : ekMasraflar) {
            anaBorc += masraflar;
        }
        return anaBorc;
    }
}