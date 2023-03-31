package Ejemplo_2;

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Days{
    Week week;
    public Days (Week week ){this.week = week;}

    public void WorkD()
    {
        switch (week){
            case MONDAY :
                System.out.println("Monday is the start of the week and is a work day.");
                break;
            case TUESDAY:
                System.out.println("Tuesdays are a work day");
                break;
            case WEDNESDAY:
                System.out.println("Wednesdays are a work day");
                break;
            case THURSDAY:
                System.out.println("Thursdays are a work day");
                break;
            case FRIDAY:
                System.out.println("Fridays are the last working day of the week.");
                break;
            case SATURDAY:
                System.out.println("Saturdays are a day of rest");
            case SUNDAY:
                System.out.println("Sundays are a day of rest");
            default:
                System.out.println("Holidays are the best days");
        }
    }

    public static void main(String[] args) {
        Days days = new Days(Week.MONDAY);
        days.WorkD();
    }


}
