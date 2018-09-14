
import java.util.Scanner;

public class lol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Änter tan wahole nombers plase");
		
		int tal1 = input.nextInt();
			
			int min = tal1;
			int max = tal1;
		
		int tal2 = input.nextInt();
		
			if(tal2 > max) {
				max = tal2;
			}
			else if(tal2 < min) {
				min = tal2;
			}
		int tal3 = input.nextInt();
		if(tal3 > max) {
			max = tal3;
		}
		else if(tal3 < min) {
			min = tal3;
		}
		int tal4 = input.nextInt();
		if(tal4 > max) {
			max = tal4;
		}
		else if(tal4 < min) {
			min = tal4;
		}
		int tal5 = input.nextInt();
		if(tal5 > max) {
			max = tal5;
		}
		else if(tal5 < min) {
			min = tal5;
		}
		int tal6 = input.nextInt();
		if(tal6 > max) {
			max = tal6;
		}
		else if(tal6 < min) {
			min = tal6;
		}
		int tal7 = input.nextInt();
		if(tal7 > max) {
			max = tal7;
		}
		else if(tal7 < min) {
			min = tal7;
		}
		int tal8 = input.nextInt();
		if(tal8 > max) {
			max = tal8;
		}
		else if(tal8 < min) {
			min = tal8;
		}
		int tal9 = input.nextInt();
		if(tal9 > max) {
			max = tal9;
		}
		else if(tal9 < min) {
			min = tal9;
		}
		int tal10 = input.nextInt();
		if(tal10 > max) {
			max = tal10;
		}
		else if(tal10 < min) {
			min = tal10;
		}
		
		int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10; 
		double medel1 = summa/10.0; 
		double medel2 = summa;
		
		
		System.out.println("Middlai:1");
		System.out.println(medel1);
		System.out.println(" ");
		System.out.println("max!");
		System.out.println(max);
		System.out.println(" ");
		System.out.println("Minimumsig:");
		System.out.println(min);

	}
	
}