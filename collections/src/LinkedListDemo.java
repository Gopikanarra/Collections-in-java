import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(null);
		ll.add('o');
		ll.add("gopika");
		ll.add(2, 4);
		System.out.println(ll);
		
//		Iterator it=ll.iterator();
//		while(it.hasNext()) {
//			LinkedList l1=(LinkedList) it.next();
//		}
		LinkedList l2=new LinkedList();
		l2.add(78);
		l2.add(10);
		l2.add(222);
		l2.add(45);
		System.out.println(l2);
		
//		ListIterator it1=l2.listIterator(3);
//		while(it1.hasPrevious()) {
//			System.out.println(it1.previous());
//		}
		
		Iterator des=l2.descendingIterator();
		while(des.hasNext()) {
			System.out.println(des.next());
		}
		
		
		}

	}


