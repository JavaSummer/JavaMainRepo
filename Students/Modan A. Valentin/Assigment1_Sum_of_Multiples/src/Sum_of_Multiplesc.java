import java.util.Scanner;

public class Sum_of_Multiplesc {
	public static void main(String[] args)
	{
	int x=new Scanner(System.in).nextInt();
	System.out.println(mult35(x-1));
	}
	//multiple of 3 plus multiple of 5
	//minus multiple of 15
	public static int mult35(int x)
	{
		return (x/3)*(x/3+1)/2*3+(x/5)*(x/5+1)/2*5-(x/15)*(x/15+1)/2*15;
	}
}
