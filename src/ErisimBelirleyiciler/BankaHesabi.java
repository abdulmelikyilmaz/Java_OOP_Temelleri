package ErisimBelirleyiciler;

class BankaHesabi {
    public String hesapSahibi;
    private double bakiye;

    BankaHesabi() {

    }

    BankaHesabi(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
    }

    void paraYatir(double miktar) {
        this.bakiye += miktar;
        bakiye();
    }

    void paraYatir(double miktar, String aciklama) {
        this.bakiye += miktar;
        bakiye();
        System.out.println("Ucret: " + aciklama);
    }

    void bakiye() {
        System.out.println("Bakiyeniz: " + this.bakiye + "TL");
    }
}