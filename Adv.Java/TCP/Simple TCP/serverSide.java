import java.net.*;
import java.io.*;
public class serverSide{
  public serverSide() throws Exception{
    ServerSocket server_socket = new ServerSocket(2020); //opening a new port 2020
    System.out.println("Port 2020 is open.");
    Socket socket = server_socket.accept();
    System.out.println("Client " + socket.getInetAddress()+" has connected.");

    //io buffer
    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

    out_socket.println("Welcome!"); //send "welcome" to the client
    String message = in_socket.readLine();
    System.out.println("Client says: "+message); //displey client's message to the console

    socket.close();
    System.out.println("Socket is closed.");
  }
  public static void main(String[] args){
    try{
      new serverSide();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
