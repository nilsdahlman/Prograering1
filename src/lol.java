
import java.util.Scanner;

public class lol {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Änter tan nombers");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int tal4 = input.nextInt();
		int tal5 = input.nextInt();
		int tal6 = input.nextInt();
		int tal7 = input.nextInt();
		int tal8 = input.nextInt();
		int tal9 = input.nextInt();
		int tal10 = input.nextInt();
		
		int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10; // 28
		double medel1 = summa/5.0; // 5
		double medel2 = summa;
		
		System.out.println(medel1);

	}
	
}