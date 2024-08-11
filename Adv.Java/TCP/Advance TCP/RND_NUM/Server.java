import java.net.*;
import java.io.*;

public class Server{
  public Server() throws Exception{
    ServerSocket server_socket = new ServerSocket(2020);
    System.out.println("Port 2020 is open.");
    Socket socket = server_socket.accept();
    System.out.println("Client "+socket.getInetAddress()+" has connected.");

    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

    String message;
    int guess = (int)(Math.random()*10+1);

    do{
      out_socket.println("Guess a number form [1-10]: ");
      message = in_socket.readLine();
    } while(!(Integer.parseInt(message)==guess));

    out_socket.println();
    out_socket.println("You got it!!!!!");
    System.out.println("Guess is right, exiting the application.");


    socket.close();
    System.out.println("Socket closed.");
  }
  public static void main(String[] args){
    try{
      new Server();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
