package Constructor;

public class Employee {
    private String name; // isim
    private double salary; // maas
    private int workHours; // calisma saati
    private int hireYear; // is baslangic yili

    public Employee() {
        // Bos Constructor.
        // Hata almamak icin
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double vergi = 0;

        if (salary <= 1000) {
            vergi = 0;
        } else {
            vergi = (salary / 100) * 3;
        }
        return vergi;
    }

    double bonus() {
        double bonus = 0;
        if (workHours <= 40) {
            bonus = 0;
        } else {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double amount = 0;
        if ((2015 - hireYear) < 10) {
            amount += (salary / 100) * 5;
        } else if ((2015 - hireYear) >= 10 && (2015 - hireYear) < 20) {
            amount += (salary / 100) * 10;
        } else {
            amount += (salary / 100) * 15;
        }
        return amount;
    }

    public String toString() {
        return "Name: " + this.name + "\nSalary: " + this.salary + "\nWorkHours: " + this.workHours + "\nHireDate: "
                + this.hireYear + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nRaise of Salary: " + raiseSalary()
                + "\nSalary with tax and bonus:" + (salary - tax() + bonus())
                + "\nTotal Salary with the raise of salary: " + (salary + raiseSalary());
    }
}
