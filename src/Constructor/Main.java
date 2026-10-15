package Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== UÇAN ARAÇ FABRİKASINA HOŞ GELDİNİZ! ===");
        System.out.println("Gemiler imal ediliyor ve sistem özellikleri yükleniyor...\n");

        // 1. Senaryo: Boş/Varsayılan Constructor Testi
        // Parametresiz constructor çalışır ve "İsimsiz" bir gemi üretir.
        UzayGemisi varsayilanGemi = new UzayGemisi();
        System.out.println("-> Varsayılan (Temel) Model Üretildi:");
        System.out.println("   Gemi Adı: " + varsayilanGemi.gemiAdi);
        System.out.println("   Yakıt: " + varsayilanGemi.yakitMiktari);
        System.out.println("   Kalkan: " + varsayilanGemi.kalkanGucu);
        System.out.println("----------------------------------------");

        // 2. Senaryo: Pilot Nesnesi Oluşturma
        // Önce gemiye atayacağımız pilotu üretelim (Constructor kullanarak)
        Pilot pilot1 = new Pilot("Arda", "Kaptan", 5);
        System.out.println("-> Pilot Hazır: " + pilot1.isim + " (" + pilot1.rutbe + ")");

        // 3. Senaryo: Savaş Modeli (Tüm parametreleri alan constructor) Testi
        UzayGemisi savasGemisi = new UzayGemisi("Fırtına-X", 100, 50, pilot1, "Lazer Topu");
        System.out.println("-> Savaş Modeli Üretildi:");
        System.out.println("   Gemi Adı: " + savasGemisi.gemiAdi);
        System.out.println("   Yakıt: " + savasGemisi.yakitMiktari);
        System.out.println("   Kalkan: " + savasGemisi.kalkanGucu);
        System.out.println("   Pilotu: " + savasGemisi.pilot.isim);
        System.out.println("   Silahı: " + savasGemisi.silahTuru);
        System.out.println("----------------------------------------");

        // 4. Senaryo: Keşif Modeli (İki parametreli constructor) Testi
        UzayGemisi kesifGemisi = new UzayGemisi("Gezgin", 4); // 4 kişi
        System.out.println("-> Keşif Modeli Üretildi:");
        System.out.println("   Gemi Adı: " + kesifGemisi.gemiAdi);
        System.out.println("   Yakıt (Kişi Sayısına Göre Hesaplandı): " + kesifGemisi.yakitMiktari);
        System.out.println("   Kalkan: " + kesifGemisi.kalkanGucu);
        System.out.println("----------------------------------------");

        System.out.println("Tüm gemiler başarıyla hangara yerleştirildi!");
    }
}
