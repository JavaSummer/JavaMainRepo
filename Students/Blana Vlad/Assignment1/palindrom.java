package assignment1;

public class palindrom {
	public static void main(String args[]){
		int[] arr;
		int k=-1,maxx=0;
		arr=new int[100000000];
		for (int i=9999;i>=1000;i--){//delete a 9 and a 0 and you have the non-twist part
			
			for(int j=9999;j>=1000;j--){
				if(ispalindrome(i*j))
				{
					k++;
					arr[k]=i*j;
				}
			}
		}
		for(int i=1;i<=k;i++){
			if(arr[i]>maxx)maxx=arr[i];
		}
		System.out.println(maxx);
	}
	public static boolean ispalindrome(int n)
	{
		int num,dig;
		 num=n;
		 int rev = 0;
		 while (num > 0)
		 {
		      dig = num % 10;
		      rev = rev * 10 + dig;
		      num = num / 10;
		 }
		 if(n==rev)return true;
		 else return false;
	}
	
}
