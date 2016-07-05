package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int []mass=new int[5];
        int min;
        for (int i=0;i <mass.length;i++){
            mass[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0;i<mass.length-1;i++){
            if (mass[i]>mass[i+1]){
                min=mass[i+1];
                mass[i+1]=mass[i];
                mass[i]=min;
                i=-1;

            }
        }
        for (int i=0;i<mass.length;i++){
            System.out.println(mass[i]);
        }
        //напишите тут ваш код
    }

}
