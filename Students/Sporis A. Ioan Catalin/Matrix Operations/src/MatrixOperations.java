import java.math.*;
public class MatrixOperations{

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal[][] sum = new BigDecimal[a.length][a.length];
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++){
				a[i][j] = a[i][j].add(b[i][j]);
				a[i][j] = a[i][j].setScale(2, RoundingMode.CEILING);
			}
		sum = a;
		return sum;
	}
	public static BigDecimal[][] subtract (BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal[][] result = new BigDecimal[a.length][a.length];
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++){
				a[i][j] = a[i][j].subtract(b[i][j]);
				a[i][j] = a[i][j].setScale(2, RoundingMode.CEILING);
			}
		result = a;
		return result;
	}
	public static BigDecimal[][] multiply (BigDecimal[][] a, BigDecimal[][] b){
		BigDecimal[][] result = new BigDecimal[a.length][a.length];
		int i,j,k,l;
		for(k=0;k<a.length;k++)
			for(l=0;l<a.length;l++)
				result[k][l] = new BigDecimal("0.0");
		for(k=0;k<a.length;k++)
			for(l=0;l<a.length;l++){
				i=j=0;
				while(i<a.length && j<a.length){
					result[k][l] = result[k][l].add(a[k][j].multiply(b[i][l]));
					result[k][l] = result[k][l].setScale(2, RoundingMode.CEILING);
					i++;
					j++;
				}
			}
		
		return result;
	}
	public static BigDecimal[][] multiplyScalar (BigDecimal[][] a, BigDecimal nr){
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++){
				a[i][j] = a[i][j].multiply(nr);
				a[i][j] = a[i][j].setScale(2, RoundingMode.CEILING);
			}
		return a;
	}
	public static Boolean areEqual (BigDecimal[][] a, BigDecimal[][] b){
		int i,j;
		Boolean k = false;
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++){
				if(a[i][j]!=b[i][j]){
					k = false;
					break;
				}
				else 
					k = true;
			}
		return k;
	}
	public static Boolean isZeroMatrix (BigDecimal[][] a){
		Boolean v = true;
		int i,j;
		BigDecimal s = new BigDecimal("0.0");
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++)
				if(a[i][j]!=s){
					v = false;
					break;
				}
		return v;
	}
	public static BigDecimal determinant(BigDecimal[][] a){
		BigDecimal sum = new BigDecimal("0.0");
		BigDecimal s;
		int i,k,l;
		if(a.length==1)
			return a[0][0];
		
		for(i=0;i<a.length;i++){
			BigDecimal[][] smaller = new BigDecimal[a.length-1][a.length-1];
			for(k=1;k<a.length;k++)
				for(l=0;l<a.length;l++){
					if(l<i)
						smaller[k-1][l] = a[k][l];
					else if(l>i)
						smaller[k-1][l-1] = a[k][l];
				}
			if(i%2 == 0)
				s = new BigDecimal("1");
			else
				s = new BigDecimal("-1");
			sum = sum.add(s.multiply(a[0][i]));
			
		}
		return sum;		
	}
	public static Boolean isIdentityMatrix (BigDecimal[][] a){
		int i,j;
		Boolean check = true;
		BigDecimal x = new BigDecimal("1.0");
		BigDecimal y = new BigDecimal("0.0");
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++)
				if(i == j)
					if(!(a[i][j].equals(x))){
						check = false;
						break;
					}
				else if(i != j)
					if(!(a[i][j].equals(y))){
						check = false;
						break;
					}
						
						
		return check;			
	}
	public static int fillDegre (BigDecimal[][] a){
		int i,j;
		int fill = 0;
		BigDecimal y = new BigDecimal("0");
		for(i=0;i<a.length;i++)
			for(j=0;j<a.length;j++)
				if(!(a[i][j].equals(y)))
					fill ++;
		return (fill*100)/(a.length*a.length);
	}
}
