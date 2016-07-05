package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("Ivanon","Ivan");
        map.put("Petrov","Vasiliy");
        map.put("Sidorov","Konstantin");
        map.put("Pupkin","Vasiliy");
        map.put("Shumaher","Misha");
        map.put("Torkvemada","Tomas");
        map.put("Ivanov2","Ivan1");
        map.put("Ivanov3","Ivan2");
        map.put("Ivanov4","Ivan3");
        map.put("Ivanov5","Ivan4");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String,String>> iterator;map.entrySet().iterator();
        HashSet<String> duplicateNames=new HashSet<>();
        for (Map.Entry<String,String> pair: map.entrySet())
        {
            iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,String>comparePair=iterator.next();
                if (pair.getValue()==comparePair.getValue() && pair.getKey()!=comparePair.getKey())
                {
                    duplicateNames.add(pair.getValue());
                    // duplicateNames.add(comparePair.getKey());
                }
            }
        }
        for (String s : duplicateNames)
            removeItemFromMapByValue(map,s);
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }


    }
}
