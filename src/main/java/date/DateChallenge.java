package date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class DateChallenge {

	public static void main(String... doYourBest) {
		List<SpiderMan> spiderManList = Arrays.asList(
				new SpiderMan("The Spider Man", LocalDate.of(1962, Month.SEPTEMBER, 8)),
				new SpiderMan("The Black Suit", LocalDate.of(1984, Month.SEPTEMBER, 8)),
				new SpiderMan("Spider-Man 2099", LocalDate.of(1992, Month.SEPTEMBER, 17)));

		LocalDate now = LocalDate.of(2017, Month.SEPTEMBER, 18);
		
		spiderManList.forEach(
				s -> { Period period = Period.between(s.creationDate, now);
					System.out.println(s.costume + " " +
					period.get(ChronoUnit.YEARS) + " years " +
                    period.get(ChronoUnit.DAYS) + " days");
				}
		);
	}

	static class SpiderMan {
	    String costume;
		LocalDate creationDate;

		SpiderMan(String costume, LocalDate dateOfBirth) {
			this.costume = costume; this.creationDate = dateOfBirth.plusDays(2).plusYears(2);
		}
	}

}

