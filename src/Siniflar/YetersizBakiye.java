package Siniflar;

public class YetersizBakiye extends Exception {
    public YetersizBakiye() {
        super("Cekilmek istenen tutar bakiyeden buyuk olamaz");
    }
}
