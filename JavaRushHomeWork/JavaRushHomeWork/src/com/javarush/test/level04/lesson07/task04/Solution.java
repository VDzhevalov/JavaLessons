package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int positiveCount=0;
        int negativeCount=0;

        for(int i=1;i<=3;i++)
            if(0<Integer.parseInt(reader.readLine())){
                positiveCount++;
            } else {
                negativeCount++;
            }
        System.out.println("количество отрицательных чисел: "+negativeCount);
        System.out.println("количество положительных чисел: "+positiveCount);
        //напишите тут ваш код

    }
}
