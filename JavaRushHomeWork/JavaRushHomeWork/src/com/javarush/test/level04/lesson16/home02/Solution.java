package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        System.out.println(getMiddle( a, b, c));


        //напишите тут ваш код
    }

    public static int getMiddle(int a,int b,int c){
            if (!(a==getMin( a, b,c)) && !(a==getMax( a, b,c))) return  a;
            if (!(b==getMin( a, b,c)) && !(b==getMax( a, b,c))) return  b;
            if (!(c==getMin( a, b,c)) && !(c==getMax( a, b,c))) return  c;
        return 0;
    }

    public static int getMin(int a,int b,int c){
        if (a<=b &&a<=c) return a;
        if (b<=a && b<=c) return b;
        return c;
    }
    public static int getMax(int a,int b,int c) {
        if (a>=b && a>=c) return a;
        if (b>=a && b>=c) return b;
        return c;
    }
}
