package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array1=new int[10];
        int[] backwardArray=new int[array1.length];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<array1.length; i++){
            array1[i]=Integer.parseInt(reader.readLine());
            backwardArray[array1.length-1-i]=array1[i];
        }

        for (int i=0;i<backwardArray.length; i++)
            System.out.println(backwardArray[i]);

        //напишите тут ваш код

    }
}
