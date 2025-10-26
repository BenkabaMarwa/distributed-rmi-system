
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {

	public static void main(String[] args) {

		try {
			System.out.println("Serveur CreateAnnuaire");
            Registry registry = LocateRegistry.createRegistry(1099);
			System.out.println("Serveur En exuction..");
			RMIinterface Od= new RMImplementation();
			//Od.reverse(x);
			registry.rebind("StringReversal",Od);
			System.out.println("objet distance publier..");
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
