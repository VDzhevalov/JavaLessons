package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //String name1=reader.readLine();
        //Human grandFather1 = new Human(reader.readLine(),Boolean.parseBoolean(reader.readLine()),Integer.parseInt(reader.readLine()));
        ArrayList<Human> arr=new ArrayList<>();
        Human child1 =new Human("Child1", true,10);
        Human child2 =new Human("Child2", true,6);
        Human child3 =new Human("Child3", true,3);
        Human father =new Human("Father", true,35,child1,child2,child3);
        Human mather = new Human("Mather1", false,30,child1,child2,child3);
        Human grandFather1 = new Human("GrandF1", true,70,mather);
        Human grandFather2 = new Human("GrandF2", true,75,father);
        Human grandMather1 = new Human("GrandM1", false,70,mather);
        Human grandMather2 = new Human("GrandM2", false,75,father);

        Collections.addAll(arr,grandFather1,grandFather2,grandMather1,grandMather2,father,mather,child1,child2,child3);
        for (Human s : arr){
            System.out.println(s);
        }
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex =sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age,ArrayList<Human> children){
            this(name,sex,age);
            this.children=children;
        }

        public Human (String name, boolean sex, int age, Human ... children){
            this(name,sex,age);
            for (Human s : children){
                this.children.add(s);
            }
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
