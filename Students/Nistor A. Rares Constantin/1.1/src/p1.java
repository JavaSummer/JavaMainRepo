import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int i, sum = 0, z;
		z = x.nextInt();
		for (i = 3; i <= z; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
		x.close();
	}
}