import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n = in.nextInt();
			long m = (n - 1) / 3;
			long three = 3 * (m + 1) * m / 2;
			m = (n - 1) / 5;
			long five = 5 * (m + 1) * m / 2;
			m = (n - 1) / 15;
			long fifteen = 15 * (m + 1) * m / 2;
			System.out.println((three + five - fifteen));
		}
		in.close();
	}
}