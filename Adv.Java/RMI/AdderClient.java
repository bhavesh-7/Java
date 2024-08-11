import java.rmi.*;
import java.util.Scanner;

public class AdderClient{
	public static void main(String[] args){
		Scanner get =new Scanner(System.in);
		try{
			Adder obj = (Adder)Naming.lookup("rmi://localhost:2020/send");
			int x,y;
			System.out.print("Enter 1st number: ");
			x=get.nextInt();
			System.out.print("Enter 2nd number: ");
			y=get.nextInt();
			int r = obj.add(x,y);
			System.out.println(r);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}