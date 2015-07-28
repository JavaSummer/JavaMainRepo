
public class pal {
	public static void main(String[] args) {
		int max=0,i,j;
		for(i=100;i<=999;i++)
			for(j=100;j<=999;j++)
				if(i*j==palindrom(i*j))
					if(i*j>max)
						max=i*j;
			
		System.out.println(max);
	}

	public static int palindrom(int a) {
		int aux = 0;
		while (a != 0) {
			aux = aux * 10 + a % 10;
			a /= 10;
		}
		return aux;
	}

}
