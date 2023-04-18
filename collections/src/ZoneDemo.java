import java.io.*;
import java.time.*;
public class ZoneDemo {

	public static void main(String[] args) {
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		ZonedDateTime zt=ZonedDateTime.now();
		System.out.println(zt);
		
		ZoneId z1=ZoneId.of("Europe/London");
		System.out.println(z1);
		ZonedDateTime zt1=ZonedDateTime.now(z1);
		System.out.println(zt1);
		
		
		
		
	}

}
