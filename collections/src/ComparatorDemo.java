import java.util.*;

class University {
	String name;
	int id;
	String code;
	University(String n,int no,String c){
		name=n;
		code=c;
		id=no;
	}
	public String toString() {
		return "university name:"+name+", id:"+id+", code:"+code+"\n";
	}
}
//class ComparatorDemo1 implements Comparator<University>{
//	public int compare(University u1,University u2) {
//		return u1.id-u2.id;
//	}
//	
//}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<University> al=new ArrayList<University>();
		al.add(new University("lpu",10,"Lp34"));
		al.add(new University("amritha",2,"am22"));
		al.add(new University("sasthra",3,"ss55"));
		al.add(new University("kanchi",4,"kk1d1"));
		al.add(new University("Parul",5,"pa20k"));
		System.out.println(al);
//		Comparator<University> c=(University u1,University u2)->u1.id-u2.id;
		
		
		Collections.sort(al,( u1, u2)->u1.name.compareTo(u2.name));	
		
		
		System.out.println(al);
	}

}
