package fine.project;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Chatter {
	private Socket socket;

	public Chatter(Socket socket) {
		this.socket = socket;
	}

	void execute() throws IOException{
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		new Thread(new OutputMessages(outputStream)).start();
		new Thread(new InputMessages(inputStream)).start();
	}
}
