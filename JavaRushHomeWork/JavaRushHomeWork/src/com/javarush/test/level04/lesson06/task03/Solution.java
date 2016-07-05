package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        sort(a,b,c);

        //напишите тут ваш код

    }
    public static void sort(int a,int b, int c){
        int temp;
        int arr[]={a,b,c};
        for (int i=0; i<arr.length-1;)
            if(arr[i]<arr[i+1])
            {
                temp = arr[i + 1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=0;
            }else i++;

        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
