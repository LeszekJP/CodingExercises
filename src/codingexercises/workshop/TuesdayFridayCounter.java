package codingexercises.workshop;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class TuesdayFridayCounter {

	public static long counter(LocalDate start, LocalDate stop) {
		
		//finding first and last tuesday in given range
		LocalDate firstTuesday = start.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		LocalDate lastTuesday = stop.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
		
		//count number of tuesdays between start and stop date
		long numberOfTuesdays = ChronoUnit.WEEKS.between(firstTuesday, lastTuesday);
		
		//finding first and last friday in given range
		LocalDate firstFriday = start.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		LocalDate lastFriday = stop.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		
		//count number of fridays between start and stop date
		long numberOfFridays = ChronoUnit.WEEKS.between(firstFriday, lastFriday);
		
		//add numbers of tuesdays and fridays both enlarged by one to count last days in range
		long totalNumber = numberOfTuesdays + 1 + numberOfFridays + 1;
		return totalNumber;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("there are "+counter(LocalDate.of(2018, Month.JANUARY, 1), LocalDate.of(2018, Month.JANUARY, 31))+" tuesdays and fridays in given range");
		
	}
}
