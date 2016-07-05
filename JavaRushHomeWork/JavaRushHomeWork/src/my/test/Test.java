package my.test;

/**
 * Created by vdzhevalov on 5/30/2016.
 */
public class Test
{
    public static void main(String[] args)
    {
        StringBuilder s=new StringBuilder();
        for (int i=1;i<=100;i++){
            s.setLength(0);
            if (i % 3 ==0)
                s.append("Fizz");
            if (i % 5==0)
                s.append("Buzz");
            System.out.println(s.length() > 0 ? s : i);
        }
/*
        int d=65;
        int m=61;
        System.out.println(d/m+" ostatok "+d % m);
        System.out.println(100001>>1);*/


    }
}
