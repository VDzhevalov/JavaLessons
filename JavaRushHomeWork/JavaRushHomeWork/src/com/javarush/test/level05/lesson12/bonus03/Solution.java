package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter;
        do
        {
            //System.out.println("Введите количество (положительное число)");
            counter=Integer.parseInt(reader.readLine());
        }while (0>counter);

        int maximum =Integer.parseInt(reader.readLine());
        for(int i=1;i<counter;i++){
            maximum=max(maximum,Integer.parseInt(reader.readLine()));
        }
        //напишите тут ваш код
        System.out.println(maximum);
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
