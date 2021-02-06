import java.rmi.*;
import java.rmi.server.*;

public class StrongServer extends UnicastRemoteObject implements Strong {

public StrongServer() throws RemoteException {
super();
}
static int[] factorial = { 1, 1, 2, 6, 24, 120,720, 5040, 40320, 362880 };
public boolean isStrong(int n) throws RemoteException {
	String num = Integer.toString(n);
    int sum = 0;
	for (int i = 0;i < num.length(); i++) {
            sum += factorial[Integer.parseInt(num.charAt(i)+ "")];
        }
    return sum == n;
}

public static void main(String args[]) throws Exception {
StrongServer server = new StrongServer();
System.out.println("RMI server is running");
Naming.rebind("StrongServer", server);
}

}