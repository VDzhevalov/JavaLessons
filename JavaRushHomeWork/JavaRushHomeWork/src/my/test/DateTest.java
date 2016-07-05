package my.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by vdzhevalov on 6/1/2016.
 */
/*
Для считывания и установки различных "частей" даты используются методы get(int field), set(int field, int value), add(int field, int amount), roll(int field, int amount),
переменная типа int с именем field указывает на номер поля, с которым нужно произвести операцию. Для удобства все эти поля определены в Calendar как статические константы типа int.
Рассмотрим подробнее порядок выполнения перечисленных методов.
Метод set(int field,int value).
Как уже говорилось, данный метод производит установку какого-либо поля даты. На самом деле после вызова этого метода немедленного пересчета даты не производится.
Пересчет даты будет осуществлен только после вызова методов get(), getTime() или getTimeInMillis().
 */

public class DateTest
{
    public static void main(String[] args) {
        /*
        Метод add(int field,int delta).

Добавляет некоторое смещение к существующей величине поля. В принципе, то же самое можно сделать с помощью set(f, get(f) + delta).
В случае использования метода add следует помнить о двух правилах:
Если величина поля изменения выходит за диапазон возможных значений данного поля, то производится деление по модулю данной величины, частное суммируется со следующим по старшинству полем.
Если изменяется одно из полей, причем, после изменения младшее по отношению к изменяемому полю принимает некорректное значение, то оно изменяется на то, которое максимально близко к "старому".
         */
        exampleAdd();

        /*
        Метод roll(int field,int delta).

Добавляет некоторое смещение к существующей величине поля и не производит изменения старших полей. Рассмотрим приведенный ранее пример, но с использованием метода roll.
         */
        exampleRoll();

        /*
        Класс TimeZone предназначен для совместного использования с классами Calendar и DateFormat. Класс абстрактный, поэтому от него порождать объекты нельзя.
        Вместо этого определен статический метод getDefault(), который возвращает экземпляр наследника TimeZone с настройками, взятыми из операционной системы, под управлением которой работает JVM.
        Для того, чтобы указать произвольные параметры, можно воспользоваться статическим методом getTimeZone(String ID), в качестве параметра которому передается наименование конкретного временного пояса,
        для которого необходимо получить объект TimeZone. Набор полей, определяющих возможный набор параметров для getTimeZone, нигде явно не описывается.
        Вместо этого определен статический метод String[] getAvailableIds(), который возвращает возможные значения для параметра getTimeZone.
        Так можно определить набор возможных параметров для конкретного временного пояса (рассчитывается относительно Гринвича) String[] getAvailableIds(int offset).

         */
        exampleTimeZone();
    }

    public  static void exampleAdd(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.SECOND,75);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.MONTH,1);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
    }

    public static void exampleRoll(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.SECOND,75);
        System.out.println("Rule 1: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.MONTH,1);
        System.out.println("Rule 2: " + sdf.format(cal.getTime()));
    }

    public static  void  exampleTimeZone(){
        TimeZone tz = TimeZone.getDefault();
        int rawOffset = tz.getRawOffset();
        System.out.println("Current TimeZone " + tz.getDisplayName() + tz.getID() + "\n\n");
        // Display all available TimeZones
        System.out.println("All Available TimeZones \n");
        String[] idArr = tz.getAvailableIDs();
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(tz.getDisplayName() +
                    tz.getID() + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
    }
}
