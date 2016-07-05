package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int summ=0;
        int val;
        while ((val=Integer.parseInt(reader.readLine()))!=-1){
            summ+=val;
        }
        System.out.println(summ+val);

        //напишите тут ваш код
    }
}
