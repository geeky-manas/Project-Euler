
import java.util.*;

/**
 * @author geekymanas
 *
 */
public class P14 {
	static int seq[] = new int[5000001];

	static int sq(long n) {

		if (seq[(int) n] != 0)
			return seq[(int) n];
		if (n % 2 == 0) {
			int x = 1 + sq(n / 2);
			seq[(int) n] = x;
			return x;
		}
		long y = 3 * n + 1;
		int cnt = 1;
		while (y > 5000000) {
			if (y % 2 == 0)
				y /= 2;
			else
				y = y * 3 + 1;
			cnt++;
		}
		int x = cnt + sq(y);
		seq[(int) n] = x;
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		seq[1] = 1;
		int ii[] = new int[5000001];

		for (int i = 5000000; i >= 2; i--) {
			sq(i);
		}
		int maxi = 1;
		int max = 0;
		for (int i = 1; i <= 5000000; i++) {
			if (max <= seq[i]) {
				max = seq[i];
				maxi = i;

			}
			ii[i] = maxi;
		}
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(ii[n]);
		}
		sc.close();
	}
}
