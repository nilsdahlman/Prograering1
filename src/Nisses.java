package intro;

import java.util.Scanner;

public class Nisses {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String �lder = input.nextLine();
		
		System.out.println("Vad �r din adress?");
		String adress = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		String postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String telefon = input.nextLine();
	}

}
