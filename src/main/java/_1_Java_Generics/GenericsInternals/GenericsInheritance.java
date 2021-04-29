package _1_Java_Generics.GenericsInternals;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Name 1");
        strList.add("Name 1");
        printAllList(strList); //will work
        printList(strList); //will work
        //printListObject(strList); //will not work


        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        printAllList(numList);// will work
        //printList(numList);//will not work
        //printListObject(numList); //will not work

    }

    private static void printAllList(List list) {
        list.forEach(System.out::println);
    }

    //Super class Object will not work for Generic case
    //Inheritance and polymorphism will not work in Generics unlike the normal Java classes
    private static void printListObject(List<Object> list) {
        list.forEach(System.out::println);
    }

    private static void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}
