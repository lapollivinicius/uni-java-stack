package src.exercises.exercise_67;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.*;

public class Loans {

    String customer;
    String book;
    LocalDate loanDate;
    int loanDays;
    final int AMOUNT_PENALITY = 2;

    public Loans(String customer, String book, LocalDate loanDate, int loanDays) {
        this.customer = customer;
        this.book = book;
        this.loanDate = loanDate;
        this.loanDays = loanDays;
    }

    public LocalDate calculateReturnDate() {
        DayOfWeek dayOfWeek = DayOfWeek.from(loanDate.plusDays(loanDays));
        if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
            return loanDate.plusDays(loanDays).plusDays(1);
        } else if (dayOfWeek.equals(DayOfWeek.SATURDAY)) {
            return loanDate.plusDays(loanDays).minusDays(1);
        }
        return loanDate.plusDays(loanDays);
    }

    public long calculateDaysBeforeDelivery() {
        return ChronoUnit.DAYS.between(LocalDate.now(), loanDate.plusDays(loanDays));
    }

    public boolean checkForDelays() {
        return !this.calculateReturnDate().isAfter(LocalDate.now());
    }

    public int calculatePenality() {
        int days = (int) this.calculateDaysBeforeDelivery();
        if (days >= 0) return 0;
        return Math.abs(days * AMOUNT_PENALITY);
    }

    public String getResume() {
        return "BOOK: " + book + "\n" +
                "COSTUMER: " + customer + "\n" +
                "LOAN DATE: " + loanDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "RETURN DATE: " + this.calculateReturnDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "STATUS: " + (this.checkForDelays() ? "delayed": "up to date") + "\n" +
                "EXTRA FEE: " + NumberFormat.getCurrencyInstance(Locale.of("pt", "BR")).format(this.calculatePenality());
    }

}
