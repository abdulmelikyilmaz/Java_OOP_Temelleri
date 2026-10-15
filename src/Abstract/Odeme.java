package Abstract;

public abstract class Odeme {
    private String musteriAdi;
    private double islemTutari;

    Odeme() {
        // Main classta hata almaktan kurtulduk
    }

    Odeme(String musteriAdi, double islemTutari) {
        this.musteriAdi = musteriAdi;
        if (islemTutari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.islemTutari = islemTutari;
        }
    }

    String getMusteriAdi() {
        return this.musteriAdi;
    }

    void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    double getIslemTutari() {
        return this.islemTutari;
    }

    void setIslemTutari(double islemTutari) {
        if (islemTutari < 0) {
            throw new IllegalArgumentException();
        } else {
            this.islemTutari = islemTutari;
        }
    }

    abstract void odeme();

}
