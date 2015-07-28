package mathematics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Alexa
 *
 */

public class WriteFile {
	
	private String path;
	private boolean appendToFile = false;

	/**
	 * constructor method that sets a value for the path field (instance
	 * variable), which is the name and location of the file
	 * 
	 * @param filepath
	 */
	public WriteFile(String filepath) {
		path = filepath;
	}

	/**
	 * another constructor method with 2 param a file path and an append value
	 * used if you want to append to the file
	 * 
	 * @param filepath
	 * @param appendValue
	 */
	public WriteFile(String filepath, boolean appendValue) {
		path = filepath;
		appendToFile = appendValue;
	}

	/**
	 * 
	 * @param textLine
	 *            - obviously the text I want to write to the file
	 * @throws IOException
	 */
	public void WriteToFile(String textLine) throws IOException {

		FileWriter write = new FileWriter(path, appendToFile);
		PrintWriter printLine = new PrintWriter(write);

		printLine.printf("%s" + "%n", textLine);
		printLine.flush();
		printLine.close();

	}
}
