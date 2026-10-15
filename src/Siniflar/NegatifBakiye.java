package Siniflar;

public class NegatifBakiye extends Exception {
    public NegatifBakiye() {
        super("Para yatirma degeri sifir veya negatif olamaz!");
    }
}
