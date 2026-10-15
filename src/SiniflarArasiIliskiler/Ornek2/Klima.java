package SiniflarArasiIliskiler.Ornek2;

class Klima {
    private String marka;
    private double sicaklikDerecesi;
    private boolean calismaDurumu;

    private static int toplamKlima = 0;

    Klima() {
        // Hata almamak icin;
    }

    Klima(String marka, double sicaklikDerecesi, boolean calismaDurumu) throws SicaklikDerecesi {
        this.marka = marka;
        if (sicaklikDerecesi > 40 || sicaklikDerecesi < -15) {
            throw new SicaklikDerecesi();
        } else {
            this.sicaklikDerecesi = sicaklikDerecesi;
        }
        this.calismaDurumu = calismaDurumu;
        toplamKlima++;
    }

    String getKlimaMarkasi() {
        return this.marka;
    }

    void setKlimaMarkasi(String marka) {
        this.marka = marka;
    }

    double getKlimaSicaklikDerecesi() {
        return this.sicaklikDerecesi;
    }

    void setKlimaSicaklikDerecesi(double sicaklikDerecesi) {
        if (sicaklikDerecesi > 40 || sicaklikDerecesi < -15) {
            try {
                throw new SicaklikDerecesi();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.sicaklikDerecesi = sicaklikDerecesi;
        }
    }

    // Overloading
    void setKlimaSicaklikDerecesi(int sicaklikDerecesi) {
        if (sicaklikDerecesi > 40 || sicaklikDerecesi < -15) {
            try {
                throw new SicaklikDerecesi();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.sicaklikDerecesi = sicaklikDerecesi;
        }
    }

    String getKlimaCalismaDurumu() {
        if (this.calismaDurumu == false) {
            return "Calismiyor";
        } else {
            return "Calisiyor";
        }
    }

    void setKlimaCalismaDurumu(boolean calismaDurumu) {
        if (this.calismaDurumu == false) {
            this.calismaDurumu = false;
            System.out.println("Calismiyor");
        } else {
            this.calismaDurumu = true;
            System.out.println("Calisiyor");
        }
    }

    static int getToplamKlimaSayisi() {
        return toplamKlima;
    }

}
