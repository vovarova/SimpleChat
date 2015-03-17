package fine.project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Socket socket = null;
		if("s".equals(args[0])){
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[1]));
			socket = serverSocket.accept();
		}else if("c".equals(args[0])){
			socket = new Socket(args[1], Integer.parseInt(args[2]));
		}
		Chatter chatter = new Chatter(socket);
		chatter.execute();
	}
}
