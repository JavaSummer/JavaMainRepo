import java.util.*;


public class SumOfMultiples {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Nnumber: ");
		int number = keyboardInput.nextInt();
		int sum=0, firstQuotient=0, secondQuotient=0, thirdQuotient=0;
		if(number%3 != 0 && number%5 != 0){
			firstQuotient = number/3;
			secondQuotient = number/5;
			thirdQuotient = number/15;
			sum = (3*firstQuotient*(firstQuotient+1))/2 + (5*secondQuotient*(secondQuotient+1))/2 - (15*thirdQuotient*(thirdQuotient+1))/2;
		}
		else if (number%3 != 0 && number%5 == 0){
			firstQuotient = number/3;
			secondQuotient = number/5 - 1;
			thirdQuotient = number/15;
			sum = (3*firstQuotient*(firstQuotient+1))/2 + (5*secondQuotient*(secondQuotient+1))/2 - (15*thirdQuotient*(thirdQuotient+1))/2;
		}
		else if (number%3 == 0 && number%5 != 0){
			firstQuotient = number/3 - 1;
			secondQuotient = number/5;
			thirdQuotient = number/15;
			sum = (3*firstQuotient*(firstQuotient+1))/2 + (5*secondQuotient*(secondQuotient+1))/2 - (15*thirdQuotient*(thirdQuotient+1))/2;
		}
		else if (number%3 == 0 && number%5 == 0){
			firstQuotient = number/3 - 1;
			secondQuotient = number/5 - 1;
			thirdQuotient = number/15 -1;
			sum = (3*firstQuotient*(firstQuotient+1))/2 + (5*secondQuotient*(secondQuotient+1))/2 - (15*thirdQuotient*(thirdQuotient+1))/2;
		}
		else{
			System.out.println("Error");
		}
		keyboardInput.close();
		System.out.println("Result: " +sum);
		System.out.println("Overflow for int: " + Integer.MAX_VALUE);
		System.out.println("Overflow for long: " + Long.MAX_VALUE);
	}
}
