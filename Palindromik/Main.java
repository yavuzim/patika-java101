package javaders;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String kelime="kemal";
		String ters="";
		for(int i=kelime.length()-1; i>-1; i--) {
			ters+=kelime.charAt(i);
		}
		if(kelime.equals(ters)) System.out.println(kelime+" kelimesi Palindromik'tir'");
		else System.out.println(kelime+" kelimesi Palindromik değildir!'");

	}

}
