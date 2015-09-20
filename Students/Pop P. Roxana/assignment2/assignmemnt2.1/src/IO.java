import java.io.*;

public class IO {

	HelpfulFunctions obj = new HelpfulFunctions();
	private BufferedReader br;
	private File file;
	private FileWriter fw;
	BufferedWriter bw;

	// input functions
	public void creatingBufferReader(String filename) throws IOException {

		br = new BufferedReader(new FileReader(filename));

	}

	public void readPolynomial(double poly[]) throws IOException {

		String line = br.readLine();
		obj.extractPolyMethod(poly, line);
	}

	public void readEmptyLine() throws IOException {

		// empty line
		String line = br.readLine();
	}

	public String readCommand() throws IOException {

		String command = br.readLine();
		return command;
	}

	public void closeBufferReader() throws IOException {

		br.close();

	}

	// output functions

	public void creatingBufferWriter(String filename) throws IOException {

		file = new File(filename);
		// if file doesn't exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		fw = new FileWriter(file.getAbsoluteFile());
		bw = new BufferedWriter(fw);
	}

	public void writeToFile(String s) throws IOException {

		bw.write(s);
		bw.newLine();

	}

	public void closeBufferWriter() throws IOException {

		bw.close();

	}
}
