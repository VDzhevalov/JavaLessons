package com.javarush.test.level03.lesson08.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String sponsor=reader.readLine();
        String singer=reader.readLine();
        System.out.print(sponsor+ " проспонсировал "+singer+", и она стала известной певицей.");
        //напишите тут ваш код

    }
}