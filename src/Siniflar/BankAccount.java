package Siniflar;

public class BankAccount {
    public String hesapSahibi;
    public double bakiye;

    public BankAccount() {
    }

    public BankAccount(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
    }

    void paraYatir(double paraYatir) {
        if (paraYatir <= 0) {
            try {
                throw new NegatifBakiye();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            bakiye += paraYatir;
            bilgileriGoster();
        }

    }

    void paraCek(double paraCek) {
        if (paraCek > bakiye) {
            try {
                throw new YetersizBakiye();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Para cekme islemi basarili!");
            bakiye -= paraCek;
            bilgileriGoster();
        }
    }

    void bilgileriGoster() {
        System.out.println(hesapSahibi + " adli hesap sahibinin guncel bakiyesi: " + bakiye);
    }
}
