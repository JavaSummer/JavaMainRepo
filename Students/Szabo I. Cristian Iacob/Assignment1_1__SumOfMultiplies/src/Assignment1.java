import java.util.Scanner;
public class Assignment1 {
 
  static Scanner keyInput = new Scanner(System.in);
  public static void main(String[] args)
  {
	 System.out.print("Give a number: ");
	 int number = keyInput.nextInt();
	 addMultiplies(number);
	 System.out.println("An overflow will occur for integers greater than " + Integer.MAX_VALUE + " or longs greater than " + Long.MAX_VALUE);
  }
  
  public static void addMultiplies(int n)
  {
	  
	  int sum = 0;
	  for(int i=0;i<n;i++)
		  if(i%3 == 0 || i%5 == 0)
			  sum += i;
	  System.out.println("The sum of the multiplies of 3 and 5 below " + n + " is " + sum);
	  }
}
