import java.util.ArrayList;

public class MainClass {
  public static void main(String[] args)
  {   
	  FileRead.readLines();
	  FileRead.printLinesRead();
	  String lineOne = FileRead.getLineOne();
	  String lineTwo = FileRead.getLineTwo();
	  ArrayList<Integer> polyOne = new ArrayList<Integer>();
	  polyOne = FileRead.lineToIntArray(lineOne);
	  ArrayList polyTwo = new ArrayList<Integer>();
	  polyTwo = FileRead.lineToIntArray(lineTwo);
	  Functions.add(polyOne, polyTwo);
  }
}
