import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
  public Client() throws Exception {
    Socket socket = new Socket("127.0.0.1",2020);
    System.out.println("Connection Established Sucessfully.");

    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
    Scanner get = new Scanner(System.in);
    String message=in_socket.readLine();
    System.out.print(message);
    String name = get.nextLine();
    out_socket.println(name);

    socket.close();
    System.out.println("Socket Closed.");
  }
  public static void main(String[] args) {
    try {
      new Client();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
