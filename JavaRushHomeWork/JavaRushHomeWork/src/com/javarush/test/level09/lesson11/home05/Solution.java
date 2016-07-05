package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String inputs = reader.readLine();
        String tempVowels=charsArrToString(vowels);
        ArrayList<Character> volwesArr=new ArrayList<>();
        ArrayList<Character>consonatsArr=new ArrayList<>();
        for (char i : inputs.toCharArray()){
            if (tempVowels.contains(String.valueOf(i))){
                volwesArr.add(i);
            }
            else {
                consonatsArr.add(i);
            }
        }
        printLetters(volwesArr);
        System.out.println();
        printLetters(consonatsArr);

        //напишите тут ваш код
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void printLetters(ArrayList<Character> lettersArr){
        for (int i=0; i<lettersArr.size();i++){
            System.out.print(lettersArr.get(i));
            if (i<lettersArr.size()-1){
                System.out.print(" ");
            }
        }

    }
    public static String charsArrToString(char[] vowels){
        String result="";
        for ( char i : vowels){
            result+=i;
        }
        return result;
    }

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
