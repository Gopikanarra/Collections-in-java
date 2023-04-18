import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;


public class GenericsDemo {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList();
		al.add("gopika");
		al.add("45");
		al.add("fjfs");
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//here i am failing fast
		}
		CopyOnWriteArrayList con=new CopyOnWriteArrayList();
		con.add("werrr");
		con.add("yummy");
		con.add("dummy");
		Iterator it1=con.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			con.add("i am great");//here i am failing but safely
		}
		System.out.println(con);
	}
}


