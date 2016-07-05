package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigArray=new int[20];
        int[] smallArray1=new int[bigArray.length/2];
        int[] smallarray2=new int[bigArray.length/2];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<bigArray.length;i++){
            bigArray[i]=Integer.parseInt(reader.readLine());
        }

        for (int i=0;i<bigArray.length; i++){
            if (i<bigArray.length/2)
                smallArray1[i]=bigArray[i];
            else
                smallarray2[i-bigArray.length/2]=bigArray[i];
        }

        for (int i=0;i<smallarray2.length;i++){
            System.out.println(smallarray2[i]);
        }
        //напишите тут ваш код

    }
}
