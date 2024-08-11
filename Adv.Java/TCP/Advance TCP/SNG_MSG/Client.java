//importing network packages
import java.net.*;
//importing input/output packages
import java.io.*;
//importing utility packages
import java.util.*;
public class Client{ //creating a client class

  public Client() throws Exception{   //creating client method and throwing exception
    //using "java.net.*;" package
    Socket socket = new Socket("127.0.0.1",2020); //creating socket which is basically a door for communicition between server and clients
    System.out.println("Connection Established with the server."); //telling client that ConnectionisEstablishedProperly
    //using "java.io.*;" package
    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream())); //creating an "in socket" to accept data from Server
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true); //creating an "out socket" to give data to the Server
    //using "java.util.*;" package
    Scanner get = new Scanner(System.in); //creating scanner object to get user input
    //getting server message and printing it on the console
    String message = in_socket.readLine();
    System.out.println(message);
    //asking user name and senting it to the server
    System.out.print("Enter your Name: ");
    String name = get.nextLine();
    out_socket.println(name);
    //getting server message and printing it on the console
    String getnm = in_socket.readLine();
    System.out.println(getnm);

    //closing socket
    socket.close();
    System.out.println("Socket is closed.");
  }
  //#driverCode
  public static void main(String[] args){ //creating main method
    try{ //creating try-catch block to get the exception error
      new Client(); //creating object of the constructor method
    }catch(Exception e){ //trying to get the exception "e"
      e.printStackTrace(); //printing error exception
    }
  }
}
