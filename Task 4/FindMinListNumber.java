import java.util.Scanner;

public class FindMinListNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int min = scanner.nextInt();;


		while(scanner.hasNextInt()) {
			num = scanner.nextInt();
			
			min = num < min ? num: min;
		}
		System.out.println("min = " + min);

	}
}