import java.math.*;
import java.util.*;
import java.io.*;

public class ReadMatrixes {
	String line = null;
	File file = new File("Matrix.txt");
	BigDecimal[][] m = new BigDecimal[5][5];
	BigDecimal[][] n = new BigDecimal[5][5];
	public void input(){
	try{
		Scanner read = new Scanner(file);
		line = read.nextLine();
		String [] elements = line.split(" ");
		int i,j;
		for(j=0;j<5;j++){
			m[0][j] = new BigDecimal(elements[j]);
			//System.out.print(m[0][j] + " ");
		}
			i=1;;
		while(read.hasNextLine() && i<5){
			line = read.nextLine();
			elements = line.split(" ");
			for(j=0;j<5;j++)
				m[i][j] = new BigDecimal(elements[j]);
			i++;
		}
		line = read.nextLine();
		line = read.nextLine();
		elements = line.split(" ");
		for(j=0;j<5;j++)
			n[0][j] = new BigDecimal(elements[j]);
		i = 1;
		while((read.hasNextLine()) && i<5){
			line =read.nextLine();
			elements = line.split(" ");
			for(j=0;j<5;j++)
				n[i][j] = new BigDecimal(elements[j]);
			i++;			
		}
		read.close();
		
	}
	catch(IOException ex){
		System.out.println("Cannot read file!");
	}
}
	void printMatrix(BigDecimal[][] a){
		int i,j;
		for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			System.out.print(a[i][j] + " ");
			if(j==4)
				System.out.print("\n");
		}
		
	}
	}
}


