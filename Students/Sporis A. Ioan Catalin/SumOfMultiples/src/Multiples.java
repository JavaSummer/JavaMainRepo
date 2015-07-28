
public class Multiples {
	public static void main(String[] args){
	int i,s=0;
	
	for(i=2;i<1000;i=i+1){
		if(i%3==0)
			s=s+i;
		if(i%5==0)
			s=s+i;
	}
	System.out.println("Sum is: " + s);
}
}