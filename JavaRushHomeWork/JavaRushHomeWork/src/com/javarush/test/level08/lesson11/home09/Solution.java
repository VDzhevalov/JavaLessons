package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("January 3 1970"));
    }

    public static boolean isDateOdd(String date)
    {
        {
            SimpleTimeZone tz = new SimpleTimeZone(0, "Out Timezone");
            TimeZone.setDefault(tz);
            Pattern pattern=Pattern.compile("([A-Za-z]{3,})[ ]+(\\d{1,2})[ ]+(\\d{4})");
            Matcher matcher=pattern.matcher(date);
            matcher.find();
            date=matcher.group(1)+" "+ matcher.group(2)+" "+ matcher.group(3);
            SimpleDateFormat aa=new SimpleDateFormat("MMM dd yyyy");
            Date dt;

            try
            {
                dt = new Date(aa.parse(date).getTime());
                System.out.println(((Date)aa.parseObject(date)).getTime());
            }
            catch (Exception e){
                dt = new Date();
            }
            dt.setHours(0);
            dt.setMinutes(0);
            dt.setSeconds(0);
            long currentDate=(dt.getTime())/(1000*60*60*24);
            System.out.println(dt.getTime());
            System.out.println(currentDate);
            System.out.println("CurrentDate = "+currentDate);

            dt.setDate(01);
            dt.setMonth(0);
            long startYear = (dt.getTime())/(1000*60*60*24);
            System.out.println("StartDate = "+startYear);
            if (currentDate==startYear||((currentDate-startYear)+1)%2!=0){
                return true;
            }
            return false;
        }
    }
}
