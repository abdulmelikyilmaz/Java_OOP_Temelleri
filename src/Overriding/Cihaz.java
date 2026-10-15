package Overriding;

public class Cihaz {
    private String marka;
    private String cihazAdi;
    private boolean durum;

    Cihaz() {
        // Hata almamak icin olusturuldu
    }

    Cihaz(String marka, String cihazAdi, boolean durum) {
        this.marka = marka;
        this.cihazAdi = cihazAdi;
        this.durum = durum;
    }

    String getMarka() {
        return this.marka;
    }

    void setMarka(String marka) {
        this.marka = marka;
    }

    String getCihazAdi() {
        return this.cihazAdi;
    }

    void setCihazAdi(String cihazAdi) {
        this.cihazAdi = cihazAdi;
    }

    boolean getDurum() {
        return this.durum;
    }

    void setDurum(boolean durum) {
        this.durum = durum;
    }

    void bilgiGoster() {
        System.out.println("Cihazin markasi: " + getMarka() +
                "\nCihazin adi: " + getCihazAdi() +
                "\n Cihazin durumu: " + getDurum());
    }

}
