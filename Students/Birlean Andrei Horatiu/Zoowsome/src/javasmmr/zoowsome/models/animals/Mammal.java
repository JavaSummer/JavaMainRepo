package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal
{
   private float nomalBodyTemp;
   private float percBodyHair;
   
   public float getNomalBodyTemp()
   {
	   return this.nomalBodyTemp;
   }
   
   public float getPercBodyHair()
   {
	   return this.percBodyHair;
   }
   
   public void setNormalBodyTemp(float bodyTemp)
   {
	   this.nomalBodyTemp = bodyTemp;
   }
   
   public void setPercBodyHair(float bodyHair)
   {
	   this.percBodyHair = bodyHair;
   }
}
