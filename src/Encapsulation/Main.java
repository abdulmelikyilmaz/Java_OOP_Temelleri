package Encapsulation;

public class Main {
    /*
     * Dijital Banka Hesap Yönetim Sistemi (BankaHesabi)
     * Şu gereksinimlere uygun bir Java yapısı tasarla:
     * 
     * Sınıf ve Erişim Belirleyiciler: BankaHesabi adında bir sınıf oluştur.
     * İçerisinde hesap sahibinin adını (String), hesap numarasını (int) ve güncel
     * bakiyeyi (double) tutacak değişkenler tanımla. Bu verilerin dışarıdan
     * doğrudan değiştirilmesini önlemek için uygun erişim belirleyiciyi (private)
     * kullan.
     * 
     * Constructor: Sınıfın içine, nesne ilk oluşturulurken hesap sahibi ve
     * başlangıç bakiyesini atayan bir Constructor yaz. İstersen bildiğin
     * Overloading mantığını kullanarak sadece hesap sahibini alan ve bakiyeyi
     * otomatik sıfır yapan ikinci bir constructor daha ekleyebilirsin.
     * 
     * Getter ve Setter Metotları: private olarak sakladığın bu verilere kontrollü
     * bir şekilde dışarıdan erişebilmek ve onları güncelleyebilmek için gerekli
     * Getter ve Setter metotlarını tanımla.
     * 
     * İpucu: bakiye değerini güncelleyen setter metodunun içine, hesaba negatif bir
     * bakiye girilmesini engelleyecek mantıksal bir kontrol ekleyebilirsin.
     */
    public static void main(String[] args) {
        BankaHesabi b = new BankaHesabi("Melik");
        System.out.println(b.getBakiye());
        System.out.println("Hesap sahibi:" + b.getHesapSahibi() + " Hesap No:" + b.getHesapNumarasi());

        BankaHesabi b2 = new BankaHesabi("Abdulmelik", 91250);
        System.out.println("Hesap sahibi:" + b2.getHesapSahibi() + " Hesap No:" + b2.getHesapNumarasi());

    }
}
