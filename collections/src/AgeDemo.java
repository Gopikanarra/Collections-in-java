import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class AgeDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate Bitrthday=LocalDate.of(2004, 8, 02);
		Period p=Period.between( Bitrthday,today);
		System.out.println(p.getDays()+":"+p.getMonths()+":"+p.getYears());
		Year x=Year.of(2000);
		System.out.println(x.isLeap());
	}

}
