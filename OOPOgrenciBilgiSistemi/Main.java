package java101;

import java.util.Scanner;

class Course {
	String name, code, prefix;
	int note, quiz;
	double ratio;
	Teacher teacher;

	Course(String name, String code, String prefix, double ratio) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		this.ratio = ratio;
	}

	void printTeacher() {
		this.teacher.print();
	}

	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			printTeacher();
		} else
			System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
	}

}

class Teacher {
	String name, mpno, branch;

	Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}

	void print() {
		System.out.println("Adı : " + this.name);
		System.out.println("Numara : " + this.mpno);
		System.out.println("Branş : " + this.branch);
	}
}

class Student {
	String name, stuNo, classes;
	Course c1, c2, c3;
	boolean isPass;
	double avarage;

	Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = course1;
		this.c2 = course2;
		this.c3 = course3;
		this.isPass = false;
	}

	void addBulkExamNote(int note1, int note2, int note3, int q1, int q2, int q3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
			this.c1.quiz = q1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
			this.c2.quiz = q2;
		}

		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
			this.c3.quiz = q3;
		}

	}

	void isPass() {

		this.avarage = (this.c1.quiz * this.c1.ratio + this.c1.note * (1 - this.c1.ratio) + this.c2.quiz * this.c2.ratio
				+ this.c2.note * (1 - this.c2.ratio) + this.c3.quiz * this.c3.ratio
				+ this.c3.note * (1 - this.c3.ratio)) / 3.0;
		if (this.avarage >= 55) {
			System.out.println("Hababam Sınıfı Uyanıyor !");
			this.isPass = true;
		} else {
			System.out.println("Hababam Sınıfı Sınıfta Kaldı !");
			this.isPass = false;
		}
		printNote();
	}

	void printNote() {
		System.out.println(c1.name + " Notu : " + c1.note + " - Sözlü Notu : " + c1.quiz); // 90
		System.out.println(c2.name + " Notu : " + c2.note + " - Sözlü Notu : " + c2.quiz); // 77
		System.out.println(c3.name + " Notu : " + c3.note + " - Sözlü Notu : " + c3.quiz); // 75
		System.out.println("Ortalama : " +Math.round(this.avarage));
	}
}

public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Mahmut Hoca", "FZK", "05698554789");
		Teacher t2 = new Teacher("Kemal Hoca", "TRH", "05698558865");
		Teacher t3 = new Teacher("Mehmet Hoca", "MAT", "05698558863");

		Course fizik = new Course("Fizik", "Fiz101", "FZK", 0.20);
		Course tarih = new Course("Tarih", "Tar101", "TRH", 0.10);
		Course mat = new Course("Matematik", "Mat101", "MAT", 0.50);

		Student s1 = new Student("İnek Şaban", "123", "4", fizik, tarih, mat);
		s1.addBulkExamNote(100, 80, 100, 90, 79, 53);
		s1.isPass();
	}
}
