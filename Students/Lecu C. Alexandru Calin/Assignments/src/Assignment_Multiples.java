import java.util.Scanner;

public class Assignment_Multiples {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("x= ");
		int x = n.nextInt();
		int sum=0;
		for(int i=1;i<x;i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i);
				System.out.print(" ");
				sum = sum + i;
			}
				
		}
		System.out.println();
		System.out.println("sum = "+sum);
		n.close();
	}

}