package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        /*set the enter template */
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            /*create the Date object using string matching with the template*/
            Date strToDate = format.parse(reader.readLine());
            //System.out.println(strToDate);
            /*set the new template for input*/
            format.applyPattern("MMM dd, yyyy");
            System.out.println(format.format(strToDate).toUpperCase());

        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}
