package academy.learnprogramming;

public class Main {

    private static  final  String INVALID_VALUE_MESSAGE = "iNVALID VALUE";
    public static void main(String[] args) {

        System.out.println(getDurationString(833,20));
        System.out.println(getDurationString(50000));


    }

    public static String getDurationString(long minutes, long seconds){

        if (minutes < 0 || (seconds < 0 && seconds > 59) ){
            System.out.println("Invalid value");
        }
        float hour;
        long totalSeconds = (minutes * 60) + seconds;
        minutes = seconds/60;
        hour = totalSeconds /3600;

        String hoursString = hour + "h";
        if (hour < 10 ){
            hoursString =  hoursString;
        }
        String minutesString = hour + "m";
        if (minutes < 10 ){
            minutesString = minutesString;
        }
        String secondsString = seconds + "s";
        if (hour < 10 ){
            secondsString =   secondsString;
        }
       return hoursString  + "  : " + minutesString+ "  : " + secondsString + " s";

    }

    private static String getDurationString( long seconds) {
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds /60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }

}






