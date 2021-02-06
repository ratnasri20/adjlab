import java.rmi.*;

public interface Strong extends Remote {
public boolean isStrong(int n) throws RemoteException;
}