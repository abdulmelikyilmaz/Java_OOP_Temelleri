package Kalitim;

public class Main {
    public static void main(String[] args) {
        ElektronikUrun e = new ElektronikUrun("TC", "Laptop", 67000, 4, 24, 220);
        GidaUrunu g = new GidaUrunu("4875612", "Ekmek", 20, 48, "15.10.2026", false);
        Depo d = new Depo("Gungoren", 4);
        g.setAd("Sut");
        System.out.println(g.getAd());
        d.urunEkleme(g);
        d.urunleriListele();

    }

}
