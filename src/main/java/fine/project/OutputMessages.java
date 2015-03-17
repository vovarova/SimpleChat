package fine.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputMessages implements Runnable {
	private OutputStream outputStream;

	public OutputMessages(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public void run() {
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	
		String line;
		try {
			while((line = consoleReader.readLine())!=null){
				outputStreamWriter.write(line+"\n");
				outputStreamWriter.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
