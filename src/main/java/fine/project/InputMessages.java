package fine.project;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputMessages implements Runnable{
	private InputStream inputStream;

	public InputMessages(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void run() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		try {
			String readLine = null;
			while((readLine = bufferedReader.readLine())!=null){
				System.out.println(readLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
