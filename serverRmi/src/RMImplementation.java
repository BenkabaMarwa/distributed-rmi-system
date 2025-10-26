
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMImplementation extends UnicastRemoteObject implements RMIinterface{

	private static final long serialVersionUID = 1L;

	protected RMImplementation() throws RemoteException {
		super();
	}

	@Override
	public String reverse(String x) throws RemoteException {
        if (x == null) {
            return null;
        }
        return new StringBuilder(x).reverse().toString();
    }

}
