import java.rmi.*;
import java.util.*;

public class StrongClient {
public static void main(String args[]) throws Exception {
int n;
boolean result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the range: ");
n = sc.nextInt();

Strong s = (Strong)Naming.lookup("rmi://localhost:1099/StrongServer");
System.out.println("Strong numbers: ");
for(int i = 1; i <n;i++){
	result = s.isStrong(i);
	if(result == true){
	    System.out.println(i+" ");
     }
}
  }
}