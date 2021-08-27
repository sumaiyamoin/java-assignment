package Assignment_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//1. Find the date difference (year, day, hour, min, sec) between your birthdate and today
public class Problem1 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        long todaysTimeStamp=date.getTime();

        String birthDate= "05-04-1995 00:00:00";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date myBirthDate=sdf.parse(birthDate);

        long birthdateTimetamp=myBirthDate.getTime();
        //System.out.println(birthdateTimetamp);
        long d=todaysTimeStamp-birthdateTimetamp;
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);


    }
}
