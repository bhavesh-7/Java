import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Sender{
	public static void main(String[] args) throws SocketException, UnknownHostException,IOException{
		DatagramSocket ds = new DatagramSocket();
		Scanner get = new Scanner(System.in);
		System.out.print("Enter Some Text: ");
		String str = get.nextLine();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,2020);
		ds.send(dp);
		ds.close();
		System.out.println("DS CLOSED.");
	}
}
