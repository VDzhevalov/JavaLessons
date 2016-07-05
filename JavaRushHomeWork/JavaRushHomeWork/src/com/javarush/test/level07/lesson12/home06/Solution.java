package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> family = new ArrayList<>();
        Human grandfather1=new Human("Петрович",true,70);
        Human grandfather2=new Human("Сидорович",true,65);

        Human grandmother1 =new Human("Никитишна",false,70);
        Human grandmother2 =new Human("Ильинишна",false,60);

        Human father =new Human("Павел",true,40,grandfather1,grandmother1);
        Human mother =new Human("Аня",false,39,grandfather2,grandmother2);

        Human child1 =new Human("Игорь",true,4,father,mother);
        Human child2 =new Human("Жора",true,14,father,mother);
        Human child3 =new Human("Ира",false,10,father,mother);
        Collections.addAll(family,grandfather1,grandfather2,grandmother1,grandmother2,father,mother,child1,child2,child3);

        /*System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);*/

        for (Human s : family){
            System.out.println(s);
        }
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father=null;
        Human mother=null;
        //напишите тут ваш код
        Human(String name, Boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        Human(String name, Boolean sex, int age, Human human){
            this(name,sex,age);
            defineParent(human);
        }

        Human (String name, Boolean sex, int age, Human human, Human human2){
            this(name,sex,age);
            defineParent(human);
            defineParent(human2);
        }


        protected void defineParent(Human human){
            if (human!=null)
                if (human.sex)
                    this.father=human;
                else this.mother=human;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
