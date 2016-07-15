/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendartest;

import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Tommy
 */
public class CalendarTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println(getRegHours(8f));
    }

    public static String getRegHours(float overtimeHourLimit)
    {
        /*Date*/
        Calendar mDateIn = Calendar.getInstance();
        Calendar mDateOut = Calendar.getInstance();
        mDateOut.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, Calendar.HOUR_OF_DAY, Calendar.MINUTE);

        DecimalFormat twoDecimal = new DecimalFormat("0.##");
        double totalHours = 0;
        totalHours = (mDateOut.getTimeInMillis() - mDateIn.getTimeInMillis()) / (3.6f * Math.pow(10, 6));
        if (totalHours <= overtimeHourLimit)
        {
            return twoDecimal.format(totalHours);
        } else
        {
            return twoDecimal.format(overtimeHourLimit);
        }
    }

}
