package Overriding;

public class Klima extends Cihaz {
    private double sicaklikDerecesi;
    private String calismaModu;

    Klima() {
        // Hata almamak icin olusturuldu
    }

    Klima(String marka, String cihazAdi, boolean durum, double sicaklikDerecesi, String calismaModu) {
        super(marka, cihazAdi, durum);
        if (sicaklikDerecesi < -15 || sicaklikDerecesi > 35) {
            throw new IllegalArgumentException();
        } else {
            this.sicaklikDerecesi = sicaklikDerecesi;
        }
        this.calismaModu = calismaModu;
    }

    double getSicaklikDerecesi() {
        return this.sicaklikDerecesi;
    }

    void setSicaklikDerecesi(double sicaklikDerecesi) {
        if (sicaklikDerecesi < -15 || sicaklikDerecesi > 35) {
            throw new IllegalArgumentException();
        } else {
            this.sicaklikDerecesi = sicaklikDerecesi;
        }
    }

    String getCalismaModu() {
        return this.calismaModu;
    }

    void setCalismaModu(String calismaModu) {
        this.calismaModu = calismaModu;
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Cihazin sicaklik derecesi: " + getSicaklikDerecesi() +
                "\nCihazin calisma modu: " + getCalismaModu());
        System.out.println();
    }

}
