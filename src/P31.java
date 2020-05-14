
import java.util.*;

/**
 * @author geekymanas
 *
 */
public class P31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c[] = { 1, 2, 5, 10, 20, 50, 100, 200 };
		long a[] = new long[1000001];

		a[0] = 1;
		for (long b : c) {
			for (int i = (int) b; i <= 100000; i++) {
				a[i] += a[i - (int) b];
				a[i] %= 1000000007;
			}
		}
		while (n-- > 0) {
			int m = sc.nextInt();

			System.out.println(a[m]);
		}
		sc.close();
	}
}
