package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        printString("Мама","Мыла","Раму");
        printString("Мама","Раму","Мыла");
        printString("Мыла","Мама","Раму");
        printString("Мыла","Раму","Мама");
        printString("Раму","Мама","Мыла");
        printString("Раму","Мыла","Мама");

        //напишите тут ваш код

    }

    public static void printString(String s1, String s2,String s3){
        System.out.println(s1+s2+s3);
    }
}