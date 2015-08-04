
public class Polynomial 
{
   public int degree ;
   public int coefficients[] ;
   
   public String toString()
   {
	   String poly = new String();
	   for(int i = 0;i<this.degree - 1;i++)
	   {
		   poly=poly.concat(this.coefficients[i] + "*X^" + i + " + ");
	   }
	   poly = poly.concat(this.coefficients[this.degree-1] + "*X^" + (this.degree));
	   return poly;
   }
}
