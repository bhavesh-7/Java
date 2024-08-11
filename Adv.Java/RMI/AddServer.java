import java.rmi.*;
import java.rmi.registry.*;

public class AddServer{
	public static void main(String[] args){
		try{
			Adder obj = new AdderRemote();
			Naming.rebind("rmi://localhost:2020/send",obj);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}