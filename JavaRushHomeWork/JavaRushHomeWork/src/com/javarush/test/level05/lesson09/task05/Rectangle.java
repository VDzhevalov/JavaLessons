package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int left,top, width, height;
    public static final int defaultLeft=10, defaultTop=10, defaultWidth=10, defaultHeight=10;

    public Rectangle(int left, int top, int width, int heigth){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=heigth;
    }
    public Rectangle(int left, int top, int width){
        this(left, top, width, width);
    }

    public Rectangle(int left, int top){
        this(left, top, defaultWidth, defaultHeight);
    }
    public Rectangle(Rectangle rec){
        this(rec.left, rec.top, rec.width, rec.height);
    }
    //напишите тут ваш код

}
