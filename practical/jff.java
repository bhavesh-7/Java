import java.util.*;
import java.lang.*;
public class nayora{
	public static void main(String[] args){
		int laloa;
		int dala=0;
		int lol=0;	
		Scanner le = new Scanner(System.in);
		do{
		try{
			do{
				System.out.println(dala);
				System.out.print("Abhi number batao mia : ");
				laloa = le.nextInt();
					if (laloa == 69){
						System.out.println("Kya barabr number nikala na mia");
					}else{
						System.out.println("Kya bakwas number choose krte ho mia");
						System.out.println("chalo abhi phir se choose kro");
					}
				dala++;
				if(dala==5){
					System.out.println("Kya chumtia ho tum mia, jao nahi baji lagane ka tumhare saath");
				System.exit(0);	
				}
				lol++;
			}
			while(laloa!=69);
		}catch(Exception e){
			System.out.println("Kya karta mia number dalo");
			do{
				System.out.println(dala);
				System.out.print("Abhi number batao mia : ");
				laloa = le.nextInt();
					if (laloa == 69){
						System.out.println("Kya barabr number nikala na mia");
					}else{
						System.out.println("Kya bakwas number choose krte ho mia");
						System.out.println("chalo abhi phir se choose kro");
					}
				dala++;
				if(dala==5){
					System.out.println("Kya chumtia ho tum mia, jao nahi baji lagane ka tumhare saath");
				System.exit(0);	
				}
				lol++;
			}
			while(laloa!=69);
		}
		}while(lol!=1);
	}
}	
		
