import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int x;
		int total = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number please: ");
			x = input.nextInt();
			if (x%2==0 && x%4==0) {
				total += x;
			}
		}while (x%2==0);
		
		System.out.println("Total: " + total);
	}	
}		
