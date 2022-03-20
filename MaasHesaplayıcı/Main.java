package java101;

import java.util.Scanner;

class Employee {
	String name;
	int salary, workHours, hireYear;

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		double tax = 0.0;
		if (this.salary > 1000)
			tax = this.salary * 3 / 100;
		return tax;
	}

	int bonus() {
		int bonus = 0;
		if (this.workHours > 40)
			bonus = (this.workHours - 40) * 30;
		return bonus;
	}

	double raiseSalary() {
		double raise = 0.0;
		if ((2022-this.hireYear )< 10)
			raise = salary * 5 / 100;
		if ((2022-this.hireYear ) > 9 && (2022-this.hireYear ) < 20)
			raise = salary * 10 / 100;
		if ((2022-this.hireYear ) > 19)
			raise = salary * 15 / 100;
		return raise;
	}

	@Override
	public String toString() {

		return "Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours
				+ "\nBaşlangıç Yılı : " + this.hireYear + "\nVergi : " + this.tax() + "\nBonus : " + this.bonus()
				+ "\nMaaş Artışı : " + this.raiseSalary() + "\nVergi ve Bonuslar İle Birlikte Maaş : "
				+ (this.salary + this.bonus() - this.tax()) + "\nToplam Maaş : "
				+ (this.salary + this.bonus() - this.tax() + this.raiseSalary());

	}
}

public class Main {

	public static void main(String[] args) {
		Employee c1 = new Employee("Cezmi", 2000, 45, 1985);
		Employee c2 = new Employee("Sabri", 1000, 40, 2020);
		System.out.println(c1);
		System.out.println("-------");
		System.out.println(c2);
	}
}
