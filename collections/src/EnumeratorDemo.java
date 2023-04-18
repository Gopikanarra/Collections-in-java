import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(40);
		v.add(477);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
