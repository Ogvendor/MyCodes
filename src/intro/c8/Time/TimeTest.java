package intro.c8.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time1 time = new Time1();
        displayTime("After time object is created",time);
        System.out.println();

        time.setTime(13,27,6);
        displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99,99,99);
        }
        catch(IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n\", e.getMessage()");
        }
        displayTime("After calling setTime with invalid values", time);
    }
    public static void displayTime(String header, Time1 time){

        System.out.printf ("%s%nUniversal time: %s%nStandard time: %s%n" , header , time.toUniversalString() +time.toString());;
    }
}