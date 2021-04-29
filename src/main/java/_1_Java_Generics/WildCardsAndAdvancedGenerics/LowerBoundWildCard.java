package _1_Java_Generics.WildCardsAndAdvancedGenerics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard {
    public static void main(String[] args) {
        List<Integer> intNumber = new ArrayList<>();
        intNumber.add(10);
        intNumber.add(20);
        printNumbers(intNumber);

        List<Double> doubleNumber = new ArrayList<>();
        doubleNumber.add(2.5);
        doubleNumber.add(4.5);
        printNumbers(doubleNumber);

        List<Number> numbers = new ArrayList<Number>();
        numbers.add(2.0);
        numbers.add(1);
        addToList(numbers, 3.0);
    }

    //Using LowerBound performing write operations using super key word
    private static void addToList(List<? super Number> numbers, Number newNum) {
        numbers.add(newNum);
        System.out.println("Lower Bound Write operation adding new number");
        numbers.forEach(System.out::println);
    }


    //Using UpperBound performing read operations using extends key word
    private static void printNumbers(List<? extends Number> numbersList) {
        numbersList.forEach(System.out::println);
    }
}
