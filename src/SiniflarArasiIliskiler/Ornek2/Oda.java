package SiniflarArasiIliskiler.Ornek2;

class Oda {
    private String odaAdi;
    private Klima klima;

    Oda() {
        // Hata almamak icin
    }

    Oda(String odaAdi, Klima klima) {
        this.odaAdi = odaAdi;
        this.klima = klima;
    }

    String getOdaAdi() {
        return this.odaAdi;
    }

    void setOdaAdi(String odaAdi) {
        this.odaAdi = odaAdi;
    }

    Klima getKlima() {
        return this.klima;
    }

    void setKlima(Klima klima) {
        this.klima = klima;
    }

}
