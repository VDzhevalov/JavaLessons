package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String sum="";
        //int amount=1;
        int j=1;
        while (j<=10){
            int amount=0;
            for (int i=1;i<=j;i++){
            amount+=i;
            /*    if(i>1)
                {
                    sum += "+";
                }

                sum+=i;*/
            }
            //if(j>1)
            //    sum+="="+amount;
            System.out.println(amount);
           // sum="";
            j++;
        }

        //напишите тут ваш код

    }
}