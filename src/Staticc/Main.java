package Staticc;

public class Main {
    public static void main(String[] args) {
        Urun u = new Urun("Ekmek", 20);
        Urun u2 = new Urun("Zeytinyagi", 250);
        Urun.toplamUrunSayisiGoster();

        u.indirimYap(50, 2);

    }
}
