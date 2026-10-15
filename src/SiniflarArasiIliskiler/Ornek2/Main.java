package SiniflarArasiIliskiler.Ornek2;

public class Main {
    /*
     * Senaryo: Akıllı Ev / Akıllı Cihaz Yönetim Sistemi
     * Bu senaryoda bir evin içindeki akıllı cihazları ve bu cihazları yöneten
     * merkezi bir sistemi modelleyeceksin.
     * 
     * 1. Oluşturman Gereken Sınıflar (Classes)
     * Oda (Room): Evin odalarını temsil edecek.
     * 
     * Özellikler: Oda adı (salon, mutfak vb.), odaya ait cihaz listesi.
     * 
     * Klima (AirConditioner): Odalardaki klimaları temsil edecek.
     * 
     * Özellikler: Marka, sıcaklık derecesi, çalışma durumu (açık/kapalı).
     * 
     * Kullanici (User): Sistemi yöneten kişiyi temsil edecek.
     * 
     * Özellikler: Ad, yetki seviyesi.
     * 
     * 2. Kurman Gereken Sınıflar Arası İlişkiler
     * Kodunu yazarken şu mantıksal bağlantıları kurmanı istiyorum:
     * 
     * Composition / Aggregation (Sahip Olma İlişkisi - Has-A):
     * 
     * Bir Oda sınıfının içinde birden fazla Klima nesnesi bulunabilmeli (Örneğin;
     * Salonun kliması). Yani Oda sınıfı, Klima sınıfı ile ilişkilendirilmeli.
     * 
     * Association (Kullanım İlişkisi - Uses-A):
     * 
     * Kullanici sınıfı, odalardaki klimaları açıp kapatabilmek veya dereceyi
     * ayarlayabilmek için Klima sınıfının metodlarını kullanabilmeli.
     * 
     * 3. Senin Kodlarken Uygulaman Gerekenler
     * Bu senaryoyu koda dökerken bildiklerini şu şekilde harmanlayabilirsin:
     * 
     * Her sınıf için uygun erişim belirleyicileri (access modifiers) ve
     * encapsulation (private değişkenler, getter/setter'lar) kullan.
     * 
     * Nesneleri oluştururken constructor'lardan faydalan.
     * 
     * Örneğin, bir klimanın sıcaklığını ayarlarken farklı veri tipleri alabilmesi
     * için overloading (aşırı yükleme) kullanabilirsin (dereceyiAyarla(int derece)
     * ve dereceyiAyarla(double derece) gibi).
     * 
     * Evin toplam cihaz sayısını tutmak veya sabit bir ayar yapmak için static
     * anahtar kelimesini kullanabilirsin.
     */
    public static void main(String[] args) {
        System.out.println("Toplam klima sayisi: " + Klima.getToplamKlimaSayisi());
        Klima klima = new Klima("Arcelik", 18, false);
        Kullanici kullanici = new Kullanici("Melik", "Baba");
        Oda oda = new Oda("Salon", klima);

        Klima klima2 = new Klima("Beko", 22, true);
        Kullanici kullanici2 = new Kullanici("Omer", "Cocuk");
        Oda oda2 = new Oda("Mutfak", klima2);
        System.out.println();
        System.out.println("Klimanin bulundugu oda: " + oda2.getOdaAdi());
        System.out.println("Klima markasi: " + oda2.getKlima().getKlimaMarkasi());
        System.out.println("Klimanin sicaklik derecesi: " + oda2.getKlima().getKlimaSicaklikDerecesi());
        System.out.println("Klima calisma durumu: " + oda2.getKlima().getKlimaCalismaDurumu());
        System.out.println("Klimayi calistiran kisi: " + kullanici2.getKullaniciAdi());
        System.out.println("Klimayi calistiran " + kullanici2.getKullaniciAdi() + "'in yetkisi: "
                + kullanici2.getKullaniciYetkisi());
        kullanici2.klimayiCalistir(klima2);

        System.out.println();
        System.out.println();
        klima2.setKlimaCalismaDurumu(false);
        System.out.println("Klima calisma durumu: " + oda2.getKlima().getKlimaCalismaDurumu());

        System.out.println("Toplam klima sayisi: " + klima2.getToplamKlimaSayisi());

    }
}
