package Overriding;

public class Televizyon extends Cihaz {

    private int sesSeviyesi;

    Televizyon() {
        // Hatacan kacinmak icin
    }

    Televizyon(String marka, String cihazAdi, boolean durum, int sesSeviyesi) {
        super(marka, cihazAdi, durum);
        if (sesSeviyesi < 0 || sesSeviyesi > 100) {
            throw new IllegalArgumentException();
        } else {
            this.sesSeviyesi = sesSeviyesi;
        }
    }

    int getSesSeviyesi() {
        return this.sesSeviyesi;
    }

    void setSesSeviyesi(int sesSeviyesi) {
        if (sesSeviyesi < 0 || sesSeviyesi > 100) {
            throw new IllegalArgumentException();
        } else {
            this.sesSeviyesi = sesSeviyesi;
        }
    }

    @Override
    void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Ses seviyesi: " + getSesSeviyesi());
        System.out.println();
    }
}
