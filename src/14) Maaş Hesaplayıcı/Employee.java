import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    public String name; // Çalışanın adı ve soyadı
    public double salary; // Çalışanın maaşı
    public int workHours; // Haftalık çalışma saati
    public int hireYear;  //  İşe başlangıç yılı

    // Kurucu metot.
    public Employee(String name,double salary,int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maaşa göre vergi fiyatını hesaplayab tax metodu.
    private double tax(double salary){
        if(salary>=1000){
            return salary*3/100;
        }
        return 0;
    }

    // Haftalık çalışma süresine göre bonusu hesaplayan bonus metodu.
    private int bonus(int workHours){
        int hour = 40;
        if(workHours>=hour){
            return (workHours - hour) * 30;
        }
        return 0;
    }

    // Yıla göre maaş artışını hesaplayan raiseSalary metodu.
    private double raiseSalary(double salary){
        // Güncel yıl bilgisini aldık.
        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        if(year<10){
            return salary * 5/100;
        }
        else if(year>9 && year<20){
            return salary * 10/100;
        }
        return salary*15/100;
    }
    @Override
    public String toString() {
        double tax = this.tax(this.salary);
        int bonus = this.bonus(this.workHours);
        double raiseSalary = this.raiseSalary(this.salary);
        double tax_and_bonus_salary = this.salary - tax + bonus;
        this.salary = tax_and_bonus_salary + raiseSalary;
        String outputMessage = "Vergi : "+tax+"\nBonus : "+bonus+"\nMaaş Artışı : "+raiseSalary+"\nVergi ve Bonuslar ile birlikte maaş : "+tax_and_bonus_salary+"\nToplam Maaş :"+this.salary;
        return outputMessage;
    }
}
