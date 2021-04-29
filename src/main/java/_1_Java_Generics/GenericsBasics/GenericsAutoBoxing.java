package _1_Java_Generics.GenericsBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsAutoBoxing {
    public static void main(String[] args) {
        //AutoBoxing
        int i = 10;
        Integer x = i;

        //UnBoxing
        Integer xy = new Integer(20);
        int y = xy;

        //Generics provides the Wrapper class functionality of AutoBoxing and UnBoxing
        List<Integer> list =  Arrays.asList(10,20,30);
        int firstElement = list.get(0);
        System.out.println(firstElement);
    }
}
