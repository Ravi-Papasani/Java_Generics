package _1_Java_Generics.GenericsBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ParameterizedTypes {
    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(10,20,30);
        int firstElement = list.get(0);
        System.out.println(firstElement);

        List<String> strList = new ArrayList<>();
        strList.add("One");
        strList.add("Two");
        //return type is String for get(), when you create local variable
        String s = strList.get(0);
        System.out.println(s);

        //return type is Iterator<String> for iterator(), when you create local variable
        Iterator<String> iterator = strList.iterator();
        iterator.next();



        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);

        Integer integer = numList.get(0);
        numList.iterator();
    }
}
