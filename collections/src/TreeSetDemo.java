import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(734);
		ts.add(23);
		ts.add(25);
		ts.add(30);
		ts.add(100);
		System.out.println(ts);
//		System.out.println(ts.higher(23));
//		System.out.println(ts.ceiling(30));
//		System.out.println(ts.floor(100));
//		System.out.println(ts.lower(100));
		java.util.Iterator it=ts.iterator();
		while(it.hasNext()) 
		{
			System.out.println( it.next());
		}
	
	}

}
