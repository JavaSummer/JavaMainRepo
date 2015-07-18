import java.util.Scanner;
public class Spira {
	// The method verifies if the number is prime or not.It keeps track if the
	// number of deviders is bigger than 2.
	private static boolean prim(long number)
	{
		int i=2;
		int div=2;
		while(i<number && div == 2){
			if(number % i == 0)
				div++;
			i++;
		}
		if (div==2)
			return true;
		else
			return false;
	}
	///Ok, I don't know if it's the right aproach or not, the program will generate
	///the numbers from diagonals, but I can't find a proper length,still searching
	///and searching.
	///I found a dependency of the 3 corners of the matrix by just one.
	///I noted the corners n1(bottom right),n2(bottom left),n3(up left),n4(up right)
	///Founding the bottom right is easy, we can see that they are odd numbers raised
	///by square.Then we can also see that we have a distance that increase by 2 everytime
	///we add another rank to the matrix.
	///We can easily found the numbers but,I can't find the ratio below 10%...
	///Maybe I missed somthing...
	public static void main(String arg[]){
		Scanner number = new Scanner(System.in);
		int ok=1,i,k=1,num;
		long n1=0,n2=0,n3=0,n4=0;
		long sumprim=0,sumelse=1;
		long totalnum=0;
		double raport=0;
		System.out.println("Please insert the value of range");
		num = number.nextInt();
		//while(ok==1){
		for(i=2,k=1;i<=num;i=i+2,k=k+2){
			n1=(long)Math.pow(i+1,2);
			n2=n1-k-1;
			n3=n1-2*k-2;
			n4=n1-3*k-3;
		//}
			System.out.println(n1+" "+n2+" "+n3+" "+n4+" ");
		if(prim(n1))
			sumprim=sumprim+1;
		else
			sumelse=sumelse+1;
		
		if(prim(n2))
			sumprim=sumprim+1;
		else
			sumelse=sumelse+1;
		
		if(prim(n3))
			sumprim=sumprim+1;
		else
			sumelse=sumelse+1;
		
		if(prim(n4))
			sumprim=sumprim+1;
		else
			sumelse=sumelse+1;
		totalnum=sumelse+sumprim;
		raport=((double)sumprim)/((double)totalnum);
		if(raport<0.10)
			ok=0;
		//System.out.println("The lenght must be" +num);
		//num++;
		
		}
		System.out.println("Sumprim " +sumprim);
		System.out.println("Sumelse " +totalnum);
		System.out.println("is" +raport);
		System.out.println("The lenght must be" +num);
	}
}
