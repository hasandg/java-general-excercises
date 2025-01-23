package com.hasandag;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);


        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Calendar calendar = new GregorianCalendar(month, day, year);

        // System.out.println(formatter.format(calendar.getTime()).toUpperCase());
        return dt.getDayOfWeek().name();
    }

}

public class DateExcercise {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
/*
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);*/

        String res = Result.findDay(02, 29, 2004);

        System.out.println(res);
       /* bufferedWriter.write(res);
        bufferedWriter.newLine();*/

       // bufferedReader.close();
       // bufferedWriter.close();
    }
}