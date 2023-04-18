import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JodaDemo {

	public static void main(String[] args) {
		
		LocalDate l=LocalDate.now();
		System.out.println(l);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		int dd=l.getDayOfMonth();
		int mm=l.getMonthValue();
		int yy=l.getYear();
		
		System.out.println(dd+":"+mm+":"+yy);
		System.out.printf("%d-%d-%d",dd,mm,yy);
		
		int hh=t.getHour();
		int m=t.getMinute();
		int sec=t.getSecond();
		long nn=t.getNano();
		System.out.println("\n"+hh+":"+m+":"+sec+":"+nn);
		
		LocalDateTime ldt=LocalDateTime.of(1995,Month.MARCH,3,12,45);//Month extending from ENUM class
		System.out.println(ldt.toString());
		System.out.println(ldt.plusMonths(6));
		System.out.println(ldt.minusMonths(6));
		
		
		
	}

}
