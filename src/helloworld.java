import java.util.Scanner;

public class helloworld {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();

		if(x>0 && y>0) {
			System.out.println(1);
	}
		if(x>0 && y<0) {
			System.out.println(4);
		}
		if(x<0 && y>0) {
			System.out.println(2);
		}
		if(x<0 && y<0) {
			System.out.println(3);
		}
	
	} // END main
	
} // END helloworld