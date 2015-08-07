package mainpack;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * 
 * @author alexh
 *
 */
public class InputOutput {
	
	/** File path. */
	private String path;
	/**
	 * 0 - read.
	 * 1 - write.
	 */
	private int objType;
	/** Reader object. */
	private FileReader reader;
	/** Buffered Reader object. */
	private BufferedReader bReader;
	/**  Writer object. */
	private FileWriter writer;
	/** Buffered Writer object. */
	private BufferedWriter bWriter;
	/**
	 * Constructor.
	 * @param filePath 
	 * @param ioType - 0 for read or 1 for write
	 */
	public InputOutput(final String filePath, final int ioType) {
		this.path = filePath;
		this.objType = ioType;
		
		try {
			this.open();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			this.objType = -1;
		}
	}
	
	/**
	 * Closes the stream.
	 */
	public final void closeIO() {
		try {
			this.close();
		} catch (IOException e) {
			System.out.println("!" + e.getMessage());
		}
	}
	
	/**
	 * Opens the respective stream.
	 * @throws IOException 
	 */
	private void open() throws IOException {
		if (this.objType == 0) {
			this.reader = new FileReader(this.path);
			this.bReader = new BufferedReader(this.reader);
		} else if (this.objType == 1) {
			this.writer = new FileWriter(this.path);
			this.bWriter = new BufferedWriter(this.writer);
		}
	}
	
	/**
	 * Closes the respective stream.
	 * @throws IOException 
	 */
	private void close() throws IOException {
		if (this.objType == 0) {
			this.bReader.close();
		} else if (this.objType == 1) {
			this.bWriter.close();
		}
	}
	
	/**
	 * @return the next line of the text from the path file.
	 */
	public final String getLine() {
		
		if (this.objType == 0) {
			try {
				return this.bReader.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return "ERR";
			} 
		} 
		return null;
	}
	
	/**
	 * Writes the line in the text and goes to the next line.
	 * @param line String
	 */
	public final void putLine(final String line) {
		if (this.objType == 1 && line != null) {
			try {
				this.bWriter.write(line);
				this.bWriter.newLine();
			} catch (IOException e) {
				System.out.println("Exception in putLine " + e.getMessage());
			}
		}
	}
}
