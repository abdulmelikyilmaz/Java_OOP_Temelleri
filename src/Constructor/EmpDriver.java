package Constructor;

import java.util.Scanner;

public class EmpDriver {
    /*
     * Ödev AçıklamasıBu alıştırmada iki sınıf yazacaksınız: Employee adında bir
     * sınıf ve EmpDriver adlı sınıfın içinde yer alan bir main metodu. Employee
     * Sınıfı:Bu sınıf 4 adet nesne değişkenine (instance data) ve 5 adet metoda
     * sahiptir. 1. Nesne Değişkenleri:İsim (name) Maaş (salary) Çalışma saati (work
     * hours) İşe başlangıç yılı (hire year) 2. Metotlar:Constructor (Kurucu Metot):
     * İsim, maaş, çalışma saati ve işe başlangıç yılını ilk değer olarak atayan 4
     * parametre alır. Tax (Vergi) Metodu: Maaşa uygulanan vergiyi hesaplar: 1000 TL
     * ve altındaki maaşlardan vergi alınmaz. 1000 TL'den fazla olan maaşlara %3
     * vergi uygulanır. Bonus Metodu: Çalışanın fazladan çalışma saatlerine göre
     * bonusunu hesaplar. Buna göre, fazladan çalışılan her saat için 30 TL kazanç
     * sağlanır. RaiseSalary (Maaş Artışı) Metodu: Çalışanın maaş artışını hesaplar
     * (güncel yılın 2015 olduğunu baz alın): Eğer çalışan 10 yıldan az çalıştıysa,
     * maaş artışı %5 olacaktır. Eğer çalışan 10 yıldan uzun ve 20 yıldan az
     * çalıştıysa, maaş artışı %10 olacaktır. Eğer çalışan 19 yıldan fazla
     * çalıştıysa, maaş artışı %15 olacaktır. toString Metodu: Çalışan hakkındaki
     * bilgileri döndürür. EmpDriver Sınıfındaki Main Metodu Şunları
     * İçermelidir:Kullanıcıdan bir çalışanın adını, maaşını, çalışma saatini ve işe
     * başlangıç tarihini okumak. Önceki değerleri kullanarak Employee nesnesini
     * oluşturmak. Vergi ve bonusu hesaba katarak çalışanın toplam maaşını
     * hesaplamak. Maaş artışını uyguladıktan sonra çalışanın toplam maaşını
     * hesaplamak (bu aşamada vergi ve bonusu hesaba katmayın). Çalışan hakkında
     * bilgileri ekrana yazdırmak. Örnek Çıktı (Konsol Görüntüsü):PlaintextName:
     * kemal
     * Salary: 2000.0
     * Work Hours: 45
     * Hire Date: 1985
     * Tax: 60.0
     * Bonus: 150.0
     * Raise of Salary: 300.0
     * Salary with tax and bonus: 2090.0
     * Total Salary with the raise of salary: 2300.0
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kullanicinin adini giriniz: ");
        String name = girdi.nextLine();
        System.out.print("Kullanicinin maasini giriniz: ");
        double salary = girdi.nextDouble();
        System.out.print("Kullanicinin calisma saatini giriniz: ");
        int workHours = girdi.nextInt();
        System.out.print("Kullanicinin ise giris yilini giriniz: ");
        int hireYear = girdi.nextInt();
        System.out.println("\n\n\n");

        Employee e1 = new Employee(name, salary, workHours, hireYear);
        System.out.println(e1.toString());

    }

}
