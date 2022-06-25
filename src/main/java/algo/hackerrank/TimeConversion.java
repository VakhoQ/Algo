package algo.hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {

        String time = "07:05:45PM";
        System.out.println( timeConversion(time));

    }

    public static String timeConversion(String input)  {

        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = null;
        try {
            date = inputFormat.parse(input);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return outputFormat.format(date);


    }

}
