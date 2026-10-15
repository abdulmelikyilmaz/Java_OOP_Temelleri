package SiniflarArasiIliskiler.Ornek1;

public class Kutuphane {
    /*
     * Örnek Senaryo: Dijital Kütüphane Sistemi
     * Bu senaryoda nesnelerin birbirini alan (field) olarak tanıdığı bir ilişki
     * kurmanı istiyorum. Kod yazarken bildiğin tüm kuralları (kapsülleme, erişim
     * belirleyiciler, constructor'lar vb.) aktif olarak kullanabilirsin.
     * 
     * 1. Yazar Sınıfı
     * Özellikler (Fields): Yazarın adı, doğum yılı vb. (Bunları private yap,
     * dışarıdan doğrudan erişilemesin).
     * 
     * Gereksinimler: Constructor yaz, gerekli getter ve setter metodlarını oluştur.
     * 
     * 2. Kitap Sınıfı
     * Özellikler (Fields): Kitabın adı, sayfa sayısı ve bir Yazar nesnesi.
     * 
     * İpucu (İlişki): Kitap sınıfının içinde Yazar tipinde bir değişken olmalı.
     * Yani bir kitabın bir yazarı vardır (Has-A ilişkisi).
     * 
     * Gereksinimler: Constructor yardımıyla kitap oluşturulurken yazarı da
     * atanabilsin. Kapsülleme kurallarına uygun olarak getter ve setter'larını yaz.
     * 
     * 3. Kütüphane Sınıfı (Ana Çalıştırma veya Yönetim Sınıfı)
     * Özellikler (Fields): Kütüphanenin adı ve birden fazla Kitap nesnesini
     * tutabilen bir yapı (örneğin Kitap[] yani kitap dizisi).
     * 
     * Gereksinimler: Kütüphaneye dışarıdan kitaplar eklenebilsin ve kütüphanedeki
     * kitapların detayları (kitabın adı, sayfa sayısı ve yazarının adı) ekrana
     * yazdırılabilsin.
     */
    private String kutuphaneaAd;
    private Kitap[] kitap;

    Kutuphane() {
        // Hata almamak icin
    }

    Kutuphane(String kutuphaneaAd, Kitap[] kitap) {
        this.kutuphaneaAd = kutuphaneaAd;
        this.kitap = kitap;
    }

    String getKutuphaneaAd() {
        return this.kutuphaneaAd;
    }

    void setKutuphaneAd(String kutuphaneAd) {
        this.kutuphaneaAd = kutuphaneAd;
    }

    Kitap[] getKitap() {
        return this.kitap;
    }

    void setKitap(Kitap[] kitap) {
        this.kitap = kitap;
    }

    public void kitapEkle(Kitap yeniKitap) {
        for (int i = 0; i < kitap.length; i++) {
            // Dizideki boş (null) olan ilk yeri arıyoruz
            if (kitap[i] == null) {
                kitap[i] = yeniKitap;
                System.out.println(yeniKitap.getKitapAd() + " başarıyla kütüphaneye eklendi.");
                return;
            }
        }
        // Eğer döngü hiç if'e giremeden bittiyse demek ki dizi tamamen doludur
        System.out.println("Kütüphane kapasitesi dolu, yeni kitap eklenemez!");
    }

    public void kutuphaneBilgileriniGoster() {
        System.out.println("Kütüphane Adı: " + kutuphaneaAd);
        System.out.println("--- Kitap Listesi ---");

        for (int i = 0; i < kitap.length; i++) {
            // Dizinin o indeksi boş değilse (yani kitap varsa) yazdıralım
            if (kitap[i] != null) {
                System.out.println((i + 1) + ". Kitap:");
                System.out.println("  Adı: " + kitap[i].getKitapAd()); // Kitap sınıfındaki getter metodun
                System.out.println("  Sayfa Sayısı: " + kitap[i].getSayfaSayisi()); // Kitap sınıfındaki getter metodun

                // İşte sınıflar arası ilişkinin (Has-A) kullanıldığı yer:
                // Kitabın içinden yazara ulaşıp, yazarın adını alıyoruz
                System.out.println("  Yazarı: " + kitap[i].getYazar().getYazar());
                System.out.println("-------------------");
            }
        }
    }

}