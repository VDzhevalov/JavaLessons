package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        /*String[] array2={"asd","basd","awe","aqw","cvb","dfg","Asw","Asd","ert","tyu","ytr","uio",
        "poi","nmr","zxc","vbn","mgh","asd","Dfr","DDD"};
        for (String x : array)
        {
            System.out.println(x);
        }*/

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        int j=0;
        String temp;
        for (;j<array.length;j++)
        {
            for (int i = 0; i < array.length; i++)
            {
                if (isGreaterThan(array[i], array[j]))
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.toLowerCase().compareTo(b.toLowerCase()) > 0;
    }
}
