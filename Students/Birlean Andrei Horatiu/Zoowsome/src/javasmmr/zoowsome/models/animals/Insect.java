package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal
{
   private boolean canFly;
   private boolean isDangerous;
   
   public void setCanFly(boolean flag)
   {
	   this.canFly = flag;
   }
   
   public void setIsDangerous(boolean flag)
   {
	   this.isDangerous = flag;
   }
   
   public boolean getCanFLy()
   {
	   return this.canFly;
   }
   
   public boolean getIsDangerous()
   {
	   return this.isDangerous;
   }
}
