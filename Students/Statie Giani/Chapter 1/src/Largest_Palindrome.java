import java.util.Scanner;

public class Largest_Palindrome {
	 public static void main(String[] args) {
	        int value = 0, x=9, y=1;
	        System.out.println("Number of digits:");
	        int nrc = new Scanner (System.in).nextInt();
	        while(nrc!=0){
	        	x=(x*10)+9;
	        	y=y*10;
	        	--nrc;
	        }
	        for(int i = x;i >=y/2;i--)
	        {
	            for(int j = i;j >=y/2;j--)
	            {
	                int value1 = i * j;
	                StringBuilder sb1 = new StringBuilder(""+value1);
	                String sb2 = ""+value1;
	                sb1.reverse();
	                if(sb2.equals(sb1.toString()) && value<value1) {
	                    value = value1;

	                }

	            }
	        }

	        System.out.println(value);
	    }
}
