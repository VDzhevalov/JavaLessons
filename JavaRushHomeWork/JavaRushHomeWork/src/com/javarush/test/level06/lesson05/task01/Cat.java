package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/

import com.javarush.test.level05.lesson05.task04.Solution;

import java.util.concurrent.TimeUnit;

public class Cat
{
    public static void main(String [] args) {
        Cat cat1= new Cat();
        cat1=null;
        int counter=0;
        System.gc();
        while (5>counter){
            try {
              /*  TimeUnit.NANOSECONDS.sleep(100);
                TimeUnit.MICROSECONDS.sleep(100);
                TimeUnit.MILLISECONDS.sleep(100);*/
                TimeUnit.SECONDS.sleep(1);
                counter++;
             /*   TimeUnit.MINUTES.sleep(100);
                TimeUnit.HOURS.sleep(100);
                TimeUnit.DAYS.sleep(100);*/
            } catch (InterruptedException e) {
                //Handle exception
            }
        }
    }
    //напишите тут ваш код

    protected void finalize() throws Throwable{
        System.out.println("Help me, my name is "+ getClass() +" i feel so alone");
    }

}

