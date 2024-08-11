import java.net.*;
import java.io.*;

public class ServerThread implements Runnable{

  private Socket socket;
  private ServerMain server_main;
  public ServerThread(Socket socket,ServerMain server_main){
    this.server_main=server_main;
    this.socket=socket;
  }

  @Override
  public void run(){
    try {

      int client_number = server_main.getClientNumber();

      System.out.println("Client 0"+client_number+" has Connected.");
      BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

      out_socket.println("Enter your Name: ");
      String message = in_socket.readLine();
      System.out.println("Client says: "+message);

      socket.close();
      System.out.println("Client 0"+client_number+" has Disconnected.");
    }catch(Exception e) {
      e.printStackTrace();
    }
  }
}
