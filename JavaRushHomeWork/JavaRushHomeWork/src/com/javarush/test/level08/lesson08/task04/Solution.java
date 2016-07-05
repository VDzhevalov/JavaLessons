package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Petrov", new Date("JULY 1 1980"));
        map.put("Sidorov", new Date("MAY 1 1980"));
        map.put("Pupkin", new Date("APRIL 1 1980"));
        map.put("Petrov1", new Date("MARCH 1 1980"));
        map.put("Petrov2", new Date("FEBRUARY 1 1980"));
        map.put("Petrov3", new Date("JANUARY 1 1980"));
        map.put("Petrov4", new Date("DECEMBER 1 1980"));
        map.put("Petrov5", new Date("NOVEMBER 1 1980"));
        map.put("Petrov6", new Date("OCTOBER 1 1980"));

        /*Date date =new Date();
        date.getMonth()*/
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator=map.entrySet().iterator();
        Map.Entry<String, Date> pair;
        while (iterator.hasNext())
        {
            pair = iterator.next();
            if(pair.getValue().getMonth()>4 && pair.getValue().getMonth()<8)
                iterator.remove();
        }
    }

   /* public static void main(String[] args)
    {
        HashMap<String,Date> map=createMap();
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.println(pair.getKey()+" : "+pair.getValue().getMonth() );
        System.out.println("---------------------------------");
        removeAllSummerPeople(map);
        // Date date=map.get("Stallone");
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.println(pair.getKey()+" : "+pair.getValue().getMonth() );
    }*/

}
