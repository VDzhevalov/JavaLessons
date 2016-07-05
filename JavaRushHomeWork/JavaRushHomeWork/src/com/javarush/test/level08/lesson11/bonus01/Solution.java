package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String month=reader.readLine();
        int monthN;



        switch (month.substring(0,3)){
            case "Jan": monthN=1;
                break;
            case "Feb": monthN=2;
                break;
            case "Mar": monthN=3;
                break;
            case "Apr": monthN=4;
                break;
            case "May": monthN=5;
                break;
            case "Jun": monthN=6;
                break;
            case "Jul": monthN=7;
                break;
            case "Aug": monthN=8;
                break;
            case "Sep": monthN=9;
                break;
            case "Oct": monthN=10;
                break;
            case "Nov": monthN=11;
                break;
            case "Dec": monthN=12;
                break;
            default: monthN=0;
                break;
        }

        System.out.println(month+" is "+monthN+" month");
        //напишите тут ваш код
    }

}
