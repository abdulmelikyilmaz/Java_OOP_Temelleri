package Overriding;

public class Main {
    public static void main(String[] args) {
        Klima k = new Klima("Samsung", "Galaxy Ice", true, 18, "Calisiyor");
        Televizyon t = new Televizyon("LG", "G-5", false, 0);
        t.bilgiGoster();
        k.bilgiGoster();
    }
}
