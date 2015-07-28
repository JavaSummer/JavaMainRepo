
public class Palindrom {
	public static void main(String args[]){
		long v[]= new long[1000000];
		for (long i=9999; i>=1000;i--){
			for (long j=9999;j>=1000;j--){
				if (v[1]==0){
					long x=i*j;
					long y=x;
					long inv=0;
					while(y!=0){
						inv=inv*10+y%10;
						y=y/10;
					}
					if (x==inv) v[1]=x;
				}
			}
		} System.out.print(v[1]);
	}
}
