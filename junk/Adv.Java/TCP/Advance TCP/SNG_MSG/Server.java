import java.net.*; //importing network packages
import java.io.*; //importing I/O packages

public class Server{ //creating server class
  public Server() throws Exception{ //creating class constructor
    //creating server
    ServerSocket server_socket = new ServerSocket(2020); //creating server socket and assining the port number
    System.out.println("Port 2020 is open."); //telling that the given port is open
    Socket socket = server_socket.accept(); //creating a Socket
    System.out.println("Client "+socket.getInetAddress()+" has connected."); //getting client ip address and showing it on the server terminal
    //creating server I/O
    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream())); //creating input socket
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true); //creating output socket
    out_socket.println("Connection Initiated."); //printing confirmation on client console
    //getting name form client and sending greeting message
    String name = in_socket.readLine();
    out_socket.println("Welcome!, " + name);

    //destroying Socket
    socket.close();
    System.out.pritnln("Socket is closed.");
  }
  //#driverCode
  public static void main(String[] args){ //creating main method
    try{ //creating try-catch block
      new Server(); //creating constructor object
    }catch(Exception e){ //getting exception
      e.printStackTrace(); //printing exception error
    }
  }
}
