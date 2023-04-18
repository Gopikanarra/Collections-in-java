import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;

//import java.util.Date;
//import java.sql.Date;
public class DAteandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		long times=date.getHours();
//		
		long hour=date.getTime();
		java.sql.Date date1=new java.sql.Date(times);
		System.out.println(date1);
		java.sql.Date date2=new java.sql.Date(hour);
		System.out.println(date2);
		LocalDate today=LocalDate.now();
		LocalDate bday=LocalDate.of(2004, 8, 02);
		Period p=Period.between(today, bday);
		System.out.println(p.getDays()+" days"+p.getMonths()+" months"+p.getYears()+" years");
		Year y=Year.of(2004);
		if(y.isLeap()) {
			System.out.println("you born in leap year!!");
	
		}
		else {
			System.out.println("sorry for you!!");
		}
		
		
		
	}

}
