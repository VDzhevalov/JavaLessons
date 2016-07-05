package com.javarush.test.level08.lesson08.task02;

import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        Collections.addAll(set,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        /*Random rand = new Random();
        for (int i=0; i<20;i++)
            set.add(i+rand.nextInt(100)-50);*/
        return set;

        //напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer>iterator=set.iterator();
        int temp=0;
        while (iterator.hasNext())
        {
            temp = iterator.next();
            if (temp > 10)
                iterator.remove();
        }
        return set;
        //напишите тут ваш код

    }

   /* public static void main(String[] args)
    {
        HashSet<Integer> set=createSet();

        for (int i : set)
            System.out.println(i);
        System.out.println("-----------------------------------------------");
        set=removeAllNumbersMoreThan10(set);
        for (int i : set)
            System.out.println(i);


    }*/
}
