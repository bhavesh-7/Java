import java.net.*;
import java.io.*;
import java.util.*;
public class Client{
	public Client() throws Exception{
		Socket socket = new Socket("127.0.0.1",2020);
		
		BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
		
		String str = in_socket.readLine();
		System.out.println(str);
		socket.close();
		System.out.println("Socket Closed.");
	}
	public static void main(String[] args){
		try{
			new Client();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}