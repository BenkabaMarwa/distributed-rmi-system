
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) {
		
		try {
			
			Registry registry = LocateRegistry.getRegistry(1099);
			System.out.println("Client Connecter");
            RMIinterface ol = (RMIinterface) registry.lookup("StringReversal");
            Scanner scanner = new Scanner(System.in);
			System.out.println("Enter une liste de String");
            String x = scanner.nextLine();
            String Result=ol.reverse(x);
            System.out.println("The reverse of "+ x +" is: "+Result);
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}

}
