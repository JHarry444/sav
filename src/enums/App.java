package enums;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {
		LocalDate.of(1994, 4, 4);
		LocalDate.of(1994, Month.APRIL, 4);
	}

	private static void printDay(Day day) {
		System.out.println(day);
	}

}
