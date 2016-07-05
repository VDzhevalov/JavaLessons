package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static int getStackTraceDeep()
    {
        /*int i=1;
        for (StackTraceElement s : Thread.currentThread().getStackTrace()){
            System.out.println("iter "+i +" stack "+s);
            i++;
        }*/
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
        //напишите тут ваш код

    }

    public static void main(String[] args)
    {
       // System.out.println(method1());
    }
}
