package java101;

import java.util.Scanner;

class Fighter {
	String name;
	int damage, healt, weight, dodge;
	double start;

	public Fighter(String name, int damage, int healt, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.healt = healt;
		this.weight = weight;
		if (dodge >= 0 && dodge <= 100)
			this.dodge = dodge;
		else
			this.dodge = 0;
		this.start = Math.random() * 100;
	}

	int hit(Fighter foe) {
		System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
		if (foe.isDodge()) {
			System.out.println(foe.name + " gelen hasarı blokladı!");
			System.out.println("------------------");
			return foe.healt;
		}
		if (foe.healt - this.damage < 0)
			return 0;
		return foe.healt - this.damage;
	}

	boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
}

class Match {
	Fighter f1, f2;
	int minWeight, maxWeight;

	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	void match(Fighter f) {
		
	}

	void run() {
		if (isCheck()) {
			if (isStart()) {
				System.out.println(this.f1.name + " : " + this.f1.start);
				System.out.println(this.f2.name + " : " + this.f2.start);
				while (this.f1.healt > 0 && this.f2.healt > 0) {
					System.out.println("===YENİ ROUND===");
					this.f2.healt = this.f1.hit(this.f2);
					if (isWin()) {
						break;
					}
					this.f1.healt = this.f2.hit(f1);
					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " Sağlığı : " + f1.healt + "\n" + this.f2.name + " Sağlığı : "
							+ this.f2.healt);
				}
			} else {
				System.out.println(this.f1.name + " : " + this.f1.start);
				System.out.println(this.f2.name + " : " + this.f2.start);
				while (this.f1.healt > 0 && this.f2.healt > 0) {
					System.out.println("===YENİ ROUND===");
					this.f1.healt = this.f2.hit(this.f1);
					if (isWin()) {
						break;
					}
					this.f2.healt = this.f1.hit(f2);
					if (isWin()) {
						break;
					}
					System.out.println(this.f1.name + " Sağlığı : " + f1.healt + "\n" + this.f2.name + " Sağlığı : "
							+ this.f2.healt);
				}
			}

		} else {
			System.out.println("Sporcuların sikletleri uymuyor!");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}

	boolean isWin() {
		if (this.f1.healt == 0) {
			System.out.println(this.f2.name + " kazandı");
			return true;
		}
		if (this.f2.healt == 0) {
			System.out.println(this.f1.name + " kazandı");
			return true;
		}
		return false;
	}

	boolean isStart() {
		boolean control = false;
		if (this.f1.start != this.f2.start) {
			if (this.f1.start > this.f2.start)
				control = true;
			else
				control = false;
		}
		return control;
	}
}

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("A", 10, 120, 100, 82);
		Fighter f2 = new Fighter("B", 20, 85, 85, 80);

		Match match = new Match(f1, f2, 85, 100);
		match.run();
	}
}
