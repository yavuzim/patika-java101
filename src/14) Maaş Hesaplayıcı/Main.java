import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Fabrikada çalışan işçinin vergisini, bonusunu ve maaş artışını hesaplayan program.
               
        Scanner input = new Scanner(System.in);

        // Bilgileri klavyeden aldık.
        System.out.print("Ad Soyad : ");
        String name = input.nextLine();
        System.out.print("Maaş : ");
        double salary = input.nextDouble();
        System.out.print("Çalışma Saati :");
        int workHours = input.nextInt();
        System.out.print("Başlangıç Yılı : :");
        int hireYear = input.nextInt();

        // Employee sınıfından employee adında nesne oluşturup kurucu metoda değerleri gönderdik.
        Employee employee = new Employee(name, salary, workHours, hireYear);

        System.out.println(employee);

    }    
}
