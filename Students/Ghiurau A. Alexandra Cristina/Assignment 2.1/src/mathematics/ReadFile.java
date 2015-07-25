package mathematics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	private List<Polynomial> polinom;
	private List<String> tokens1;

	
	public void init() {
		String fileName = "pol.txt";
		polinom = new ArrayList<>();
		tokens1 = new ArrayList<>();
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferreader = new BufferedReader(inputFile);

			String line = null;

			int i = 0;
			while (((line = bufferreader.readLine()) != null) && i < 2) {
				try{
					System.out.println(line);
					i++;
					
					polinom.add(new Polynomial(line));

				} catch(Exception e){
					System.err.println("Something went wrong!" + e.getMessage());
				}
				
			}

			System.out.println();
			while (((line = bufferreader.readLine()) != null)) {
				try	{
				String s = line;
				String delims = "[ ]+";
				String[] tokens = s.split(delims);
				for (int x = 0; x < tokens.length; x++) {
					/*
					if (tokens[x].equals("ADD")) {
						System.out.println("ADDITION");
					}
					if (tokens[x].equals("SUBTRACT")) {
						System.out.println("SUBTRACTION");
					}
					if (tokens[x].equals("MULTIPLY")) {
						System.out.println("MULTIPLICATION");
					}
					if (tokens[x].equals("MUL_SCAL")) {
						System.out.println("MULTIPLY WITH: " + tokens[x + 1]);
					}
					if (tokens[x].equals("EVAL")) {
						System.out.println("EVAL WITH: " + tokens[x + 1]);
					}*/
					tokens1.add(tokens[x]);
				}
				} catch(Exception e) {
					System.err.println("Something went wrong here!" + e.getMessage());
				}
					
				
			}
			System.out.println("end of test2");

			bufferreader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Polynomial> getPolinom() {
		return polinom;
	}

	public void setPolinom(List<Polynomial> polinom) {
		this.polinom = polinom;
	}

	public List<String> getTokens() {
		return tokens1;
	}

	public void setTokens(List<String> tokens) {
		this.tokens1 = tokens;
	}

}
