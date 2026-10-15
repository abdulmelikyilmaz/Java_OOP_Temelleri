package SiniflarArasiIliskiler.Ornek1;

public class Yazar {
    private String yazar;
    private int dogumTarihi;

    Yazar() {
        // Hata almamak icin
    }

    Yazar(String yazar, int dogumTarihi) {
        this.yazar = yazar;
        if (dogumTarihi < 1900) {
            try {
                throw new DogumTarihi();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.dogumTarihi = dogumTarihi;
        }
    }

    String getYazar() {
        return this.yazar;
    }

    int getDogumTarihi() {
        return this.dogumTarihi;
    }

    void setDogumTarihi(int dogumTarihi) {
        if (dogumTarihi < 1900) {
            try {
                throw new DogumTarihi();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            this.dogumTarihi = dogumTarihi;
        }
    }

}
