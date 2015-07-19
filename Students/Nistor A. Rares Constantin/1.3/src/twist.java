
public class twist {
	public static void main(String[] args) {
		int max=0,i,j;
		for(i=1000;i<=9999;i++)
			for(j=1000;j<=9999;j++)
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
