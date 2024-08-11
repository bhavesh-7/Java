import java.net.*;
import java.io.*;
public class clientSide{
  public clientSide() throws Exception{
    Socket socket = new Socket("localhost",2020);
    System.out.println("Successful Connection to the server.");

    //I/O streams
    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

    String message = in_socket.readLine();
    System.out.println("Server says: "+message);
    out_socket.println("Thanks!");

    socket.close();
    System.out.println("Socket is closed.");
  }
  public static void main(String[] args){
    try{
      new clientSide();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
