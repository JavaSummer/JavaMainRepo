
public class Twist1 {
	public static void main(String[] args) {
		int sum=2,i;
		int[] v = new int[34];
		v[0]=1;
		v[1]=2;
		for(i=2;i<34;i++){
			v[i]=v[i-1]+v[i-2];
			if(v[i]%2==0)
			sum=sum+v[i];
		}
		System.out.println(sum);
	}
}
