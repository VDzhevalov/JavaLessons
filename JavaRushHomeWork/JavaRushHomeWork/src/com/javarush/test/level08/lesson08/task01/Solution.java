package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,"Лом","Лама","Лимон","Ленивец","Лорд","Лес","Лось","Лист","Литерал","Лангуст","Ласка","Лев","Лаз","Лотерея","Лифт","Лень","Лак","Лувр","Лестница","Литр");
        return set;
        //напишите тут ваш код

    }
}
