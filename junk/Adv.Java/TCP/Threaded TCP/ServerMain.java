import java.net.*;
import java.io.*;

public class ServerMain{
  public ServerMain() throws Exception{
    ServerSocket server_socket = new ServerSocket(2020);
    System.out.println("Port 2020 is open.");

    while(true){
      Socket socket = server_socket.accept();
      ServerThread server_thread = new ServerThread(socket,this);
      Thread thread = new Thread(server_thread);
      thread.start();
    }
  }

  private int clientnumber = 1;
  public int getClientNumber(){
    return clientnumber++;
  }

  public static void main(String[] args) {
    try {
      new ServerMain();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
