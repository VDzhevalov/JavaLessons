package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map =new HashMap<>();
        map.put("LLLL","aaaa");
        map.put("SSSS","bbb");
        map.put("DDD","aaaa");
        map.put("ZZZZ","ssss");
        map.put("MMMM","aaaa");
        map.put("FFF","ss");
        map.put("EEE","ss");
        map.put("TTT","ppp");
        map.put("HHH","nnn");
        //map.put("Мариарти","Профессор");
        map.put("MMM","www");

        return map;



        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int temp=0;
        //String key;
        for (String s : map.values())
                if (s.equals(name))
                    temp++;

        /*ArrayList<String> theSameFN = new ArrayList<>();

        for (String s : map.keySet())
        {
            //if (theSameFN.keySet().contains(s))
            if (theSameFN.contains(s))
                temp++;
            else
                theSameFN.add(s);
            //theSameFN.put(s,theSameFN.get(s)==null ? 1 : theSameFN.get(s)+1);
            //theSameFN.put()
        }*/
        return temp<0?0:temp;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int temp=0;
        //String key;
        for (String s : map.keySet())
            if (s.equals(lastName))
                temp++;
        return temp<0?0:temp;
        //напишите тут ваш код

    }

   /* public static void main(String[] args)
    {
        HashMap<String, String> map=createMap();
        String name="";
        int temp=0;
        for (String s : map.values())
            temp+=getCountTheSameFirstName(map,s);
        System.out.println("TheSameFirstName: "+temp);
        temp=0;
        for (String s : map.keySet())
            temp+=getCountTheSameLastName(map,s);
        System.out.println("TheSameLastName: "+temp);

    }*/


}
