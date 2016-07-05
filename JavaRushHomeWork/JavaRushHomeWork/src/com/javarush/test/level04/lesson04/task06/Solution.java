package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int dayNumber=Integer.parseInt(reader.readLine());
        checkDaysOfWeek(dayNumber);
        //напишите тут ваш код

    }

    public static void checkDaysOfWeek(int day){
        if (1<=day && 7>=day){
            if(1==day)
            {
                System.out.println("понедельник"); return;
            }
            if(2==day)
            {
                System.out.println("вторник"); return;
            }
            if(3==day)
            {
                System.out.println("среда"); return;
            }
            if(4==day)
            {
                System.out.println("четверг"); return;
            }
            if(5==day)
            {
                System.out.println("пятница"); return;
            }
            if(6==day)
            {
                System.out.println("суббота"); return;
            }
            System.out.println("воскресенье"); return;
        }
        System.out.println("такого дня недели не существует");
        //::CODE:
    }

}