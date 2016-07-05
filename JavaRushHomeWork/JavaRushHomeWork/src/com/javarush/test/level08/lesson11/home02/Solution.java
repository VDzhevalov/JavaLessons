package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        //System.out.println("-------------------------");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        Iterator<Cat>iteratorCat=cats.iterator();
        Iterator<Object>iteratorPet=pets.iterator();
        while (iteratorPet.hasNext()){
            Object tempPet=iteratorPet.next();
            while (iteratorCat.hasNext()){
                Object tempCat=iteratorCat.next();
                //if (tempPet.getClass()==temp.getClass()){
                if (tempPet.equals(tempCat)){
                    //System.out.println(tempPet.getClass()+": tempPet.getClass()   "+temp.getClass()+" : temp.getClass()");
                    iteratorPet.remove();
                    break;
                }

            }
            iteratorCat=cats.iterator();
        }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object s : pets){
            System.out.println(s);
        }
        //напишите тут ваш код
    }


    public static class Cat{

    }
    public static class Dog{

    }
    //напишите тут ваш код
}
