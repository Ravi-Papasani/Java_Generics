package _1_Java_Generics.WildCardsAndAdvancedGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCards {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Name 1");
        strList.add("Name 1");
        printUsingWildCard(strList); // will work using WildCard
        //printUsingObject(strList);// will not work


        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        printUsingWildCard(numList); // will work using WildCard
        //printUsingObject(numList);// will not work

    }

    //we can use WildCard expression in order to work it for both List<String> and List<Integer>
    private static void printUsingWildCard(List<?> list) {
        list.forEach(System.out::println);
        Object obj = list.get(0);//we can read and get/fetch the data using WildCards
        //list.add("Name 3"); //we cannot perform any write operations, compiler doesn't know what is the actual generic type it may get
        //list.add(30); //will not work
    }

    //will not work for Inheritance types of Object class
    private static void printUsingObject(List<Object> list) {
        list.forEach(System.out::println);
    }
}
