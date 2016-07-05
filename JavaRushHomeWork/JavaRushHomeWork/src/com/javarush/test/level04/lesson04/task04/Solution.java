package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        if (0<mount && 12>=mount){
            if(2>=mount || 12==mount)
            {
                System.out.println("зима"); return;
            }
            if (5>=mount){
                System.out.println("весна"); return;
            }
            if (8>=mount){
                System.out.println("лето"); return;
            }
            System.out.println("осень"); return;
        }
            System.out.println("Wrong number");
        //::CODE:
    }
}