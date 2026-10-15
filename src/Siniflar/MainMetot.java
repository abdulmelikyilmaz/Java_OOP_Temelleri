package Siniflar;

public class MainMetot {
    /*
     * Görev: BankAccount Sınıfı Tasarımı
     * Aşağıdaki özelliklere sahip bir Java sınıfı (class) yazmanı istiyorum:
     * 
     * 1. Nitelikler (Fields / Özellikler):
     * hesapSahibi (String) - Hesabın sahibinin adı
     * 
     * bakiye (double) - Hesaptaki para miktarı
     * 
     * 2. Kurucu Metot (Constructor):
     * Sınıf çağrıldığında hesap sahibini ve başlangıç bakiyesini alsın.
     * 
     * 3. Metotlar (Methods):
     * paraYatir(double miktar): Belirtilen miktarı bakiyeye eklesin ve güncel
     * bakiyeyi ekrana yazdırsın.
     * 
     * paraCek(double miktar): Bakiyeden çekilmek istenen miktarı düşsün (Eğer
     * bakiye yetersizse ekrana uyarı versin).
     * 
     * bilgileriGoster(): Hesap sahibini ve güncel bakiyeyi ekrana yazdırsın.
     */
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Melik", 1000);
        b.bilgileriGoster();
        BankAccount b2 = new BankAccount("Omer", 400);
        b2.bilgileriGoster();
    }
}
