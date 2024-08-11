import java.net.*;
import java.io.*;

public class reciever{
	public static void main(String[]  args) throws SocketException,IOException{
		DatagramSocket ds = new DatagramSocket(2020);
		DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
		ds.receive(dp);
		String str = new String(dp.getData(),0,dp.getLength());
		System.out.println(str);
		ds.close();
		System.out.println("DS CLOSED");
	}
}