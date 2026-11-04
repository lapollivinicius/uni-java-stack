package src.advanced;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // DATE

        // from, of to declare dates
        LocalDate date1 = LocalDate.of(1920, 10, 3);
        System.out.println(date1);

        // parse transform text in date with formatter/patern to date
        LocalDate date2 = LocalDate.parse("01/11/26", DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println(date2);

        // modify dates
        LocalDate date3 = date1.withYear(2000);
        System.out.println(date3);

        // plus, minus
        LocalDate date4 = date1.plusMonths(10);
        System.out.println(date4);

        // ChronoUnit is a unit
        LocalDate date5 = date1.minus(5, ChronoUnit.DAYS);
        System.out.println(date5);

        // to format a date and change to string
        String date6 = date1.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
        System.out.println(date6);

        // TIME
        LocalTime time1 = LocalTime.of(10, 56, 2);
        System.out.println(time1);

        LocalTime time2 = LocalTime.now().withSecond(0).withNano(0);
        System.out.println(time2);

        // DATE & TIME
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // TIMEZONE
        OffsetDateTime odt1 = OffsetDateTime.now();
        System.out.println(odt1);

        OffsetDateTime odt2 = OffsetDateTime.now();
        System.out.println(odt2);

        // TO COMPARE TIME MOMENTS
        System.out.println(odt1.isEqual(odt2));

        // TIMEZONE CHANGED
        ZonedDateTime zdt = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(zdt);

        // DURATION to hours, minutes, seconds
        Duration d1 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1.toSeconds());

        Duration d2 = Duration.between(time1, time2);
        System.out.println(d2);

        // PERIOD to years, mouth, days
        Period p1 = Period.ofYears(1);
        System.out.println(p1.toTotalMonths());

        // INSTANT to moments at time date and hours
        Instant i1 = Instant.EPOCH; // -> 1970-01-01
        System.out.println(i1);

        // to get in seconds and calculate with another date
        Instant i2 = odt1.toInstant();
        System.out.println(i2.getEpochSecond());

        // YEARMONTH
        YearMonth ym1 = YearMonth.now();
        System.out.println(ym1);

        // ENUMS - dayofweek
        DayOfWeek dw1 = DayOfWeek.MONDAY;
        System.out.println(dw1);

        DayOfWeek dw2 = DayOfWeek.of(5);
        System.out.println(dw2);

        DayOfWeek dw3 = dw1.plus(6);
        System.out.println(dw3);

        // ENUM - chronoUnit
        Long between1 = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(between1);

        // TRUNCATE - until
        LocalTime time3 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(time3.truncatedTo(ChronoUnit.SECONDS));

        // LEGACY
        Date oldDate = new Date();
        System.out.println(oldDate.toInstant());
        System.out.println(oldDate.getTime()); // EPOCH from 1970-01-01

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JULY, 11, 10, 10);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 10);
        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(calendar.getTime()));

    }

}
