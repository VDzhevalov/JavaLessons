package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //Pattern pattern=Pattern.compile("(\\w{1})(\\w*[^ ])");
        //Pattern pattern=Pattern.compile("[A-Za-zА-Яа-я]{1}[A-Za-zА-Яа-я]*[^ ]");
        Pattern pattern=Pattern.compile("[A-Za-zА-Яа-я]{1}[A-Za-zА-Яа-я]*");
        Matcher matcher=pattern.matcher(s);
        String bigLetter="";
        while (matcher.find()){
            //bigLetter=matcher.group();
            //System.out.println(matcher.group());
            bigLetter=Character.toUpperCase(matcher.group().charAt(0))+"";
            s=s.substring(0,matcher.start())+bigLetter+s.substring(matcher.start()+1);
        }
        System.out.println(s);


        //напишите тут ваш код
    }


}
