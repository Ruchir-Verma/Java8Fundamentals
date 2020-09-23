package DateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
	
	public static void main(String[] args)
	{

	LocalDate d = LocalDate.now(); 

	System.out.print(d);    //earlier prints date and time both
	
	LocalDate d1 = LocalDate.of(1997,Month.FEBRUARY,22);
	System.out.println(d1);
	
	
	LocalTime t = LocalTime.now();
	System.out.println(t);
	
	
	System.out.println();
	System.out.println();
	
	System.out.println();
	
	System.out.println();
	
	for(String s: ZoneId.getAvailableZoneIds())
	{
		System.out.println(s);
	}
	
	
	LocalTime t1 = LocalTime.now(ZoneId.of("GMT"));
	System.out.print(t1);
	
	
	
	Instant i = Instant.now();    //returns GMT
    System.out.print(i);
	
	}
}
