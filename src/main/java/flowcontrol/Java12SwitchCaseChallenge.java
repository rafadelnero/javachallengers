package flowcontrol;

public class Java12SwitchCaseChallenge {
    public static void main(String... doYourBest) {
        Java12SwitchCaseChallenge switchCaseChallenge = new Java12SwitchCaseChallenge();

        Object homerBeersTuesday = switchCaseChallenge.getBeers(WeekDay.TUESDAY);
        Object homerBeersSaturday = switchCaseChallenge.getBeers(WeekDay.SATURDAY);
        Object homerBeersForNoBeerDay = switchCaseChallenge.getBeers(WeekDay.NO_BEER_DAY);

        System.out.println("" + homerBeersTuesday + homerBeersSaturday + homerBeersForNoBeerDay);
    }

    <R extends WeekDay, T> T getBeers(R weekDay) {
        var t = switch ((WeekDay) weekDay) {
            case MONDAY -> (T) Integer.valueOf(4);
            case TUESDAY, WEDNESDAY, THURSDAY -> {
                System.out.println("Every day is beer day for Homer");
                yield (Integer.valueOf(129) == 129 ? 5 : 7);
            }
            case FRIDAY -> (T) Double.valueOf(4);
            case SATURDAY, SUNDAY -> (T) "6" == new String("6") ? 2 : 4;
            default -> new IllegalStateException("Non existent day.");
        };

        return (T) t;
    }

    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, NO_BEER_DAY
    }
}




