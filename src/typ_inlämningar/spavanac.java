package typ_inlämningar;

import java.util.Scanner;

public class spavanac {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		if(M < 45) {
			H--;
			M=M+60;
		}
		if(H <0) {
			H=23;
		}
		M = M-45;
		
		System.out.println(H + " " + M);
	}
}
