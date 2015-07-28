
public class Twist1 {
	public static int nrOfDigits(int nr){
		int k=0;
		while(nr!=0){
			nr=nr/10;
			k++;
		}
		return k;
	}
	public static int power(int a, int b){
		int i,p=1;
		for(i=0;i<b;i++)
			p=p*a;
		return p;		
	}
	public static boolean isPalidrome(int nr){
		int i=1,aux,nr2=0,u;
		aux=nr;
		int digits=nrOfDigits(nr);
		for(i=digits-1;i>=0;i--){
			u=aux%10;
			nr2=nr2+u*power(10,i);
			aux=aux/10;
		}
		if (nr2==nr)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		int i,j,palMax=Integer.MIN_VALUE;
		for(i=999;i>=100;i--)
			for(j=999;j>=100;j--){
				if(isPalidrome(i*j))
					if(i*j>palMax)
						palMax=i*j;
			}
		System.out.println(palMax);
	}

}
