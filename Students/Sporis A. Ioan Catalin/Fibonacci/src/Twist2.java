
public class Twist2 {
	public static int [][] matrixMult(int a[][],int b[][]){
		int [][] c = new int [2][2];
		c[0][0] = a[0][0]*b[0][0]+a[0][1]*b[1][0];
		c[0][1] = a[0][0]*b[0][1]+a[0][1]*b[1][1];
		c[1][0] = a[1][0]*b[0][0]+a[1][1]*b[1][0];
		c[1][1] = a[1][0]*b[0][1]+a[1][1]*b[1][1];
		return c;
	}
	public static void printMatrix(int a[][]){
		int i,j;
		for(i=0;i<2;i++)
			for(j=0;j<2;j++){
				System.out.print(a[i][j] + " ");
				if (j==1)
					System.out.print("\n");
			}
	}
	public static void main (String[] args){
		int [][] a = new int [2][2];
		int i=1;
		a[0][0]=1;
		a[0][1]=1;
		a[1][0]=1;
		a[1][1]=0;
		printMatrix(a);
		System.out.print("\n");
		int [][] b = new int [2][2];
		b=matrixMult(a,a);
		printMatrix(b);
		while(i<4000000)
		
	}

}
