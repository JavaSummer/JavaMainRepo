import java.util.Scanner;
public class Palindrome {
 static Scanner inputs = new Scanner(System.in);
 public static void main(String[] args){
	 largestPalindrome();
 }
 public static void largestPalindrome()
 {
	 int x=999,y=999;
	 int max = 0;
	 for(int a=999;a>100;a--)
		 for(int b=999;b>100;b--)
			 if(isPalindrome(a*b)>max)
			 { max=a*b;
			   x=a;
			   y=b;
			 }
	 System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + x + "*" + y + "=" + max);
 }
 
 
  public static int isPalindrome(int n)
  {
	  int inv=0;
	  int copyOfn = n;
	  while(copyOfn != 0)
	  { inv = inv*10 + copyOfn%10;
	    copyOfn /= 10;  
	  }
	  if(n == inv)
		  return n;
	  else
		  return -1;
  }
 
}
