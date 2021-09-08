package main;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	private static final String IP = "localhost";
	private static final int PORT = 8000;

	public Client() {
		System.out.println("Client started...");
		try {
			Socket socket = new Socket(IP, PORT);
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

			String message = "\nHello server\nFrom Client\nLoves";
			dataOutputStream.writeUTF(message);
			dataOutputStream.flush();
			System.out.println("Client sent a message: " + message);
			dataOutputStream.close();
			socket.close();

		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public static void main(String[] args) {

		new Client();
	}

}
