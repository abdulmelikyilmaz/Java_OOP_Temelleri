package Interfacee;

public class Main {
    public static void main(String[] args) {
        // Polimorfizm: Farklı somut sınıflar üst sınıf referansıyla tutuluyor
        OdemeYontemi[] odemeler = {
                new KrediKarti(100, "11.10.2026", "Ahmet"),
                new kriptoCuzdan(250.0, "z", "Mehmet"),
                new HediyeKarti(50.0, "", "Ayşe")
        };

        for (OdemeYontemi odeme : odemeler) {
            odeme.islemGerceklestir(); // Polimorfik çağrı

            // Güvenlikli ödeme kontrolü aşağıda yapılacak...
            System.out.println("-------------------");
        }
    }
}
