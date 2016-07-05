package my.test.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vdzhevalov on 7/4/2016.
 */
public class MapsTest
{
    public static HashMap<Integer,String> map=new HashMap<>();
    public static void main(String[] args)
    {
        map.put(1,"one");
        map.put(2,"two");
        List<Map.Entry<Integer,String>> entryList = new ArrayList(map.entrySet());

        for (Map.Entry<Integer,String> s :entryList){
            System.out.println("Key is " + s.getKey()+" Value is "+s.getValue());
        }

    }
}
