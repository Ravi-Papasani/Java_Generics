package _1_Java_Generics.WildCardsAndAdvancedGenerics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>();
        intNum.add(10);
        intNum.add(20);
        printOnlyNumberTypes(intNum);

        List<Double> doubleNum = new ArrayList<>();
        doubleNum.add(2.5);
        doubleNum.add(3.8);
        printOnlyNumberTypes(doubleNum);

        List<String> strList = new ArrayList<>();
        strList.add("Name 1");
        strList.add("Name 1");
        //printOnlyNumberTypes(strList); // will not work
    }

    // Using wildcard by extending the Number class, we are allowing only to pass any List of Number type
    private static void printOnlyNumberTypes(List<? extends Number> numType) {
        numType.forEach(System.out::println);
        Number number = numType.get(0); //numType.get() is of Number type, read operation
        //numType.add(30);// Write operation, will not work
        //numType.add(4.5);// will not work
    }
}
