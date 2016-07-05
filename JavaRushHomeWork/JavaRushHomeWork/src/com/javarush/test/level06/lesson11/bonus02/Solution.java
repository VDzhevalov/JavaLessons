package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);*/

        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat newGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat newGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat newCatFather = new Cat(fatherName,newGrandFather,null);

        String motherName = reader.readLine();
        Cat newCatMother = new Cat(motherName,null,newGrandMother);

        String sonName = reader.readLine();
        Cat newCatSon = new Cat(sonName,newCatFather,newCatMother);

        String daughterName = reader.readLine();
        Cat newCatDaughter = new Cat(daughterName,newCatFather,newCatMother);

        System.out.println(newGrandFather);
        System.out.println(newGrandMother);
        System.out.println(newCatFather);
        System.out.println(newCatMother);
        System.out.println(newCatSon);
        System.out.println(newCatDaughter);

    }
/*
    public static class Cat
    {
        protected String name;
        protected Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString()
        {
            if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }

    public static class NewCat extends Cat
    {
        private Cat parent2;
        NewCat(String name){
            super(name);
        }
        NewCat (String name, Cat parent1, Cat parent2){
            super(name, parent1);
            this.parent2=parent2;
        }

        @Override
        public String toString(){
            StringBuffer temp=new StringBuffer("Cat name is " + this.name+", ");
            if (this.parent!=null)
                temp.append("mother is "+this.parent.name+", ");
            else
                temp.append("no mother, ");
            if (this.parent2!=null)
                temp.append("father is "+this.parent2.name);
            else
                temp.append("no father");

            return temp.toString();
        }
    }*/

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent2;
        Cat(String name)
        {
            this.name = name;
        }
        Cat(String name, Cat parent, Cat parent2)
        {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            return "Cat name is " + name +
                    ((parent2 != null) ? ", mother is " + parent2.name : ", no mother") +
                    ((parent != null) ? ", father is " + parent.name : ", no father");
        }

    }




}
