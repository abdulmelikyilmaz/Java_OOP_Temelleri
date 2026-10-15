package SiniflarArasiIliskiler.Ornek1;

public class Main {
    public static void main(String[] args) {
        // 1. Adım: Yazar nesnesi oluşturma
        Yazar yazar1 = new Yazar("Sabahattin Ali", 1907);

        // 2. Adım: Kitap nesnesi oluşturma (Yazar nesnesini parametre olarak veriyoruz)
        Kitap kitap1 = new Kitap("Kürk Mantolu Madonna", 160, yazar1);

        // 3. Adım: Kütüphane nesnesi oluşturma
        Kitap[] baslangicKitaplari = new Kitap[5]; // 5 kapasiteli boş bir kitap dizisi
        Kutuphane kutuphane = new Kutuphane("Şehir Kütüphanesi", baslangicKitaplari);

        // 4. Adım: Kitabı kütüphaneye ekleme
        kutuphane.kitapEkle(kitap1);

        // 5. Adım: Kütüphanedeki kitapları listeleme / test etme
        kutuphane.kutuphaneBilgileriniGoster();
    }
}
