import java.util.*;

public class HAshSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(200);
		hs.add(300);
		hs.add(20);
		hs.add(9);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(200);
		lhs.add(null);
		lhs.add(302);
		lhs.add(499);
		lhs.add(200);
		lhs.add(89);
		System.out.println(lhs);
		if(hs.contains(455)) {
			System.out.println("good");
		}
		if(hs.contains(300)) {
			System.out.println("300 is there!!");
		}
	}

}
