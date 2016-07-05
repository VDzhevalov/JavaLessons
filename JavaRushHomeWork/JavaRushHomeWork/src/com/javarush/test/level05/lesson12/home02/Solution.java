package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1=new Man("Vasya",20,"asdasd asdas");
        Man man2=new Man("Petya",25,"bcbcv xcvxvxvcxvxccvx");

        Woman woman1=new Woman("Nastya",21,"asdasd asdas");
        Woman woman2=new Woman("Sveta",24,"asdasd asdas");
        //создай по два объекта каждого класса тут

        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
        //выведи их на экран тут
    }

    public static class Man
    {
        public String name, address;
        public int age;
        Man(String name){
            this.name=name;
        }
        Man(String name, int age){
            this(name);
            this.age=age;
        }
        Man(String name, int age, String address){
            this(name,age);
            this.address=address;
        }
        public String toString() {
            return "Man: "+name;
        }
    }
    public static class Woman
    {
        Woman(String name){
            this.name=name;
        }
        Woman(String name, int age){
            this(name);
            this.age=age;
        }
        Woman(String name, int age, String address){
            this(name,age);
            this.address=address;
        }

        String name, address;
        int age;
        public String toString() {
            return "Woman: "+name;
        }
    }

    //добавьте тут ваши классы
}
