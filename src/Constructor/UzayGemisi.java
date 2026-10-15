package Constructor;

public class UzayGemisi {
    String gemiAdi;
    int yakitMiktari;
    int kalkanGucu;
    Pilot pilot;
    String silahTuru;

    public UzayGemisi() {
        // Bos Constructor
        // Hata almamak icin
        this.gemiAdi = "Isimsiz";
        this.yakitMiktari = 50;
        this.kalkanGucu = 1;
    }

    // Savaş Modeli (Tüm Parametreleri Alan Constructor)
    public UzayGemisi(String gemiAdi, int yakitMiktari, int kalkanGucu, Pilot pilot, String silahTuru) {
        // Her şeyi kapsayan en genel constructor
        this.gemiAdi = gemiAdi;
        this.yakitMiktari = yakitMiktari;
        this.kalkanGucu = kalkanGucu;
        this.pilot = pilot;
        this.silahTuru = silahTuru;
    }

    // Temel Model (Parametresiz Constructor)
    public UzayGemisi(String gemiAdi, int yakitMiktari, int kalkanGucu, Pilot pilot) {
        // Bu constructor Savas Modeli constructor'unu kullaniyor
        this(gemiAdi, yakitMiktari, 1, null, "yok");
    }

    // Keşif Modeli (İki Parametreli Constructor)
    public UzayGemisi(String gemiAdi, int kisiSayisi) {
        this(gemiAdi, kisiSayisi * 5, 1, null, "yok");
    }

}
