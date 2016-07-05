package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int left,top, width, height;
    public final int defailtLeft=10,defaultTop=10, defaultWidth=10, defaultHeight=10;
    public void initialize(int left, int top, int width, int heigth){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=heigth;
    }
    public void initialize(int left, int top, int width){
        initialize(left, top, width, width);
    }

    public void initialize(int left, int top){
        initialize(left, top, this.defaultWidth, this.defaultHeight);
    }
    public void initialize(Rectangle rec){
        initialize(rec.left, rec.top, rec.width, rec.height);
    }
    //напишите тут ваш код

}
