package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();


        int count =Integer.parseInt(reader.readLine());
        int move=Integer.parseInt(reader.readLine());

        for (int i=0;i<count;i++){
            list.add(reader.readLine());
        }

        //System.out.println("mmmmm");


        for (int i=0; i<move; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for (String s : list)
            System.out.println(s);

        //напишите тут ваш код
    }
}
