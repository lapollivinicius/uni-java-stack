package src.advanced;

/**
 * ABOUT ENUMS
 * - interfaces can be implemented
 */
public enum WeekDaysEnum {

    // everyone can be a block
    MON(0),
    TUE(1),
    WED(2),
    THU(3),
    FRI(4),
    SAT(5),
    SUN(6);

    private final int numDay;

    WeekDaysEnum(int numDay) {
        this.numDay = numDay;
    }

    public int getNumDay() {
        return numDay;
    }
}
