package enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.SATURDAY;
        System.out.println(w1==w2);
        System.out.println(w1.equals(w2));
        System.out.println(w2.getMood());
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY,
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
// constructor in enum is always private (even without modifiers)
    WeekDays (String mood){
        this.mood=mood;

    }

    WeekDays() {

    }

    public String getMood (){
        return mood;
    }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo (){
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("may have a rest");
                break;
        }
        System.out.println(weekDay.getMood());
    }
}
