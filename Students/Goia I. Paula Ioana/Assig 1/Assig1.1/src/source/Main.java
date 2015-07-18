package source;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int nr = n.nextInt();
		long s = 0;
		for(int i = 1; i < nr ; i++){
			if(i % 3==0 || i%5==0){
				s += i;
			}
		}
		System.out.println("The sum is " + s);
	}

}
