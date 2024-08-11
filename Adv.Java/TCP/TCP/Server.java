import java.net.*;
import java.io.*;
public class Server{
	public Server() throws Exception{
		ServerSocket server_socket = new ServerSocket(2020);
		System.out.println("Port 2020 is open");
		Socket socket = server_socket.accept();
		
		BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
		
		out_socket.println("Welcome");
		socket.close();
		System.out.println("Socket Closed.");
		}
	public static void main(String[] args){
		try{
			new Server();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}