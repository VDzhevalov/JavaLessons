package com.javarush.test.level06.lesson08.task02;

import com.javarush.test.level05.lesson05.task04.Solution;

/**
 * Created by vdzhevalov on 5/20/2016.
 */
public class Test
{
    public static void main(String[] args)
    {
        Cat cat1=new Cat();
        System.out.println(Cat.getCatCount());
        Cat.setCatCount(5);
        System.out.println(Cat.getCatCount());

        Cat cat2=new Cat();
        System.out.println(Cat.getCatCount());
    }
}
