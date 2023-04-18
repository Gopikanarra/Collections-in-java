import java.util.*;


public class VectorDemo {

	public static void main(String[] args) {
		ArrayList v=new ArrayList();
		v.add(45);
		v.add(22);
		v.add(3);
		System.out.println(v);
		Iterator it=v.iterator();
		while(it.hasNext()) {
			Integer o=(Integer) it.next();
			System.out.println(o);
			if(o%2==0) {
				System.out.println("remove it!!!"+o);
			}
		}
		
	}

}
