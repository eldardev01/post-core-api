package homework10;

public enum Weekday {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String title;

    Weekday (String title) {
        this.title = title;
    }


    public boolean isWeekDay(Weekday dayName) {
        return !isHoliday(dayName);
    }

    public boolean isHoliday (Weekday dayName) {

        return dayName.equals(SATURDAY) || dayName.equals(SUNDAY);
    }






}
