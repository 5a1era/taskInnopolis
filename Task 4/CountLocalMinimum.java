import java.util.Scanner;
import java.util.ArrayList;
public class CountLocalMinimum {
	public static void main(String[] args) {
	// 	int[] a = {33,3,25,2,26,4,27,-1};
	// 	int countLocMin = 0;
	// 	int = 1;

	// while(a[i] != -1) {
	// 	if(a[i] < a[i - 1] && a[i] < a[i + 1]) {
	// 		countLocMin++;
	// 	}
	// 	i++;
	// }
	// System.out.println(countLocMin);

	 ArrayList<Integer> numsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int countLocMin = 0;
        int num = 0;
        int i = 1;

        do {
            num = scanner.nextInt();
            numsList.add(num);
        } while(num != -1);

        while(i < numsList.size() - 1) {
            if(numsList.get(i) < numsList.get(i + 1) &&
                    numsList.get(i) < numsList.get(i - 1)) {
                countLocMin++;
            }
            i++;
        }
        System.out.println(countLocMin);
}

}