import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		
		al.add("gopika");
		al.add(45);
		al.add('n');
		System.out.println(al);
		
		
		ArrayList al2=new ArrayList();
		al2.add(null);
		al2.add(40);
		al2.add(10);
		System.out.println(al2);

		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al2.contains(30));
		
		
		al2.addAll(2, al2);
		System.out.println(al2);
		System.out.println(al2.remove(3));
		System.out.println(al2);
		al2.ensureCapacity(5);
		al2.clear();
		al.clear();
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al2.isEmpty());
		
	}

}
