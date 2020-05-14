import java.util.Scanner;

/**
 * @author geekymanas
 *
 */
public class P18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nn = sc.nextInt();
			int n[][] = new int[nn][nn];
			for (int i = 0; i < nn; i++) {
				for (int j = 0; j <= i; j++) {
					n[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i < nn; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0) {
						n[i][j] += n[i - 1][j];
					} else if (j == i) {
						n[i][j] += n[i - 1][j - 1];
					} else {
						if (n[i - 1][j] > n[i - 1][j - 1])
							n[i][j] += n[i - 1][j];
						else
							n[i][j] += n[i - 1][j - 1];
					}
				}
			}
			int max = 0;
			for (int i = 0; i < nn; i++) {
				if (n[nn - 1][i] > max)
					max = n[nn - 1][i];
			}
			System.out.println(max);
		}
		sc.close();
	}
}