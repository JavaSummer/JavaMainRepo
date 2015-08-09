import java.util.*;
public class Functions {
	InputOutput prnt = new InputOutput();
	public void ADD (int [] p1, int [] p2,int deg1, int deg2){
		int i;
		int n;
		if(deg1 >= deg2)
			n = deg1;
		else
			n = deg2;
		int [] sum = new int [n];
		for(i=0;i<n;i++)
			sum[i] = 0;
		if(deg1 >= deg2){
			for(i=0;i<deg2;i++){
				sum[i] = sum[i] + p1[i] + p2[i];
			}
			for(i=deg2;i<deg1;i++)
				sum[i] = p1[i];
		}
		else{
			for(i=0;i<deg1;i++)
				sum[i] = p1[i] + p2[i];
			for(i=deg1;i<deg1;i++)
				sum[i] = p2[i];
		}

		for(i=n-1;i>=0;i--){
			System.out.print(sum[i] +"x" + "^" + i + " ");
		
		prnt.Output(sum[i],i);
		}
		prnt.Output3();
		System.out.print("\n");
	}
	
	public void SUBTRACT (int [] p1, int [] p2,int deg1, int deg2){
		int i;
		int n;
		if(deg1 >= deg2)
			n = deg1;
		else
			n = deg2;
		int [] diff = new int [n];
		if(deg1 >= deg2){
			for(i=n-1;i>=deg2;i--)
				diff[i]= p1[i];
			for(i=deg2-1;i>=0;i--)
				diff[i] = p1[i]-p2[i];
		}
		else{
			for(i=n-1;i>=deg1;i--)
				diff[i] = p2[i];
			for(i=deg1;i>=0;i--)
				diff[i] = p1[i]-p2[i];
		}
		for(i=n-1;i>=0;i--){
			System.out.print(diff[i] +"x" + "^" + i + " ");
			prnt.Output(diff[i], i);
		}
		prnt.Output3();
		System.out.print("\n");
	}
	
	public void MULTIPLY (int [] p1, int [] p2,int deg1, int deg2){
		int [] mult = new int [deg1 + deg2 -1];
		int  i;
		for (i=0;i<mult.length;i++)
			mult[i]=0;
		for(i=0;i<deg1;i++){
			int j = 0;
			while (j < deg2){
				mult[i + j] = mult[i + j] + (p1[i] * p2[j]);
				j++;
			}
		}
		for(i=mult.length-1;i>=0;i--){
			System.out.print(mult[i] +"x" + "^" + i + " ");
			prnt.Output(mult[i], i);
		}
		prnt.Output3();
		System.out.print("\n");
	}
	public void MUL_SCAL (int [] p1, int [] p2,int deg1, int deg2, int n){
		int i;
		for(i=0;i<deg1;i++){
			p1[i] = p1[i] * n;
		}
		for(i=0;i<deg2;i++)
			p2[i] = p2[i] * n;
		for(i=deg1-1;i>=0;i--){
			System.out.print(p1[i] +"x" + "^" + i + " ");
			prnt.Output(p1[i], i);
		}
		prnt.Output3();
		System.out.print("\n");
		for(i=deg2-1;i>=0;i--){
			System.out.print(p2[i] +"x" + "^" + i + " ");
			prnt.Output(p2[i], i);
		}
		prnt.Output3();
		System.out.print("\n");
	}
	
	public void EVAL (int [] p1, int [] p2,int deg1, int deg2, int n){
		int i;
		int result1=0, result2=0;
		for(i=0;i<deg1;i++)
			result1 = p1[i] * n + result1;
		for(i=0;i<deg2;i++)
			result2 = p2[i] * n + result2;
		System.out.println("First polynomial " + result1 );
		System.out.println("Second polynomial " + result2 );
		System.out.print("\n");
		prnt.Output3();
		prnt.Output2(result1,result2);
		
	}
}
