import java.util.*;

public class MapDEmo {

	public static void main(String[] args) {
		Map hm=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hm.put(i1,"sachin");
		hm.put(i2,"dhoni");
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		hm.put(17, "sachin");
//		hm.put(7, "dhoni");
//		hm.put(18,"kohli");
//		hm.put(45,"rohith");
//		Set s=hm.keySet();
//		Collection c=hm.values();
//		Set data=hm.entrySet();
//		System.out.println("key set is:"+hm.keySet());
//		System.out.println("value set is:"+hm.values());
//		System.out.println("converting into set :"+hm.entrySet());
//		System.out.println();
//		System.out.println("keys"+s);
//		System.out.println(s.getClass().getName());
//		System.out.println();
//		System.out.println("values:"+c);
//		System.out.println(c.getClass().getName());
//		System.out.println();
//		System.out.println("data: "+data);
//		System.out.println("data is : "+data.getClass().getName());
//		
//		System.out.println();
//		Iterator itr=data.iterator();
//		while(itr.hasNext()) {
//			Map.Entry md=(Map.Entry)itr.next();
//		
//			if(md.getKey().equals(18)) {
//				
//				md.setValue("virat kohli");
//			}
//			
//			System.out.println(md.getKey()+":"+md.getValue());
//		}
//		
//		HashMap hm2=new HashMap();
//		hm2.put(10,"vimal");
//		hm2.put(20,"funny");
//		hm2.put(30,"gonda");
//		hm.putAll(hm2);
//		System.out.println(hm.equals(hm2));
//		System.out.println(hm);
//		TreeMap tm=new TreeMap();
//		tm.putAll(hm);
//		System.out.println(tm.getClass().getName());//binary search order
//		
		
	}

}
