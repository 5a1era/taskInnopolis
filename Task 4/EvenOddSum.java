import java.util.Scanner;
import java.util.ArrayList;

public class EvenOddSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<>();
		int num = -1;
		int evenSum = 0;
		int oddSum = 0;

		do {
			num = scanner.nextInt();
			numList.add(num);
		} while(num != -1);

		for(int el : numList) {
			if(el % 2 == 0) {
				evenSum += el;
			} else {
				oddSum += el;
			}
		}

		System.out.println("Even sum = " + evenSum);
		System.out.println("Odd sum = " + oddSum);
	}
}