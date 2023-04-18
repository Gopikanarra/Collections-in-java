import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class FailFastSafeDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(34);
		al.add(564);
		al.add(900);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			
//		}
		Iterator ai=al.iterator();
		while(ai.hasNext()) {
			System.out.println(ai.next());
			//al.add(66);//concurrent modification fails-so failfast but i want to acheive fail fast so...
		}
		CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(300);
		cal.add(467);
		Iterator it=cal.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			cal.add(398);
		}
		
		
	}

}
