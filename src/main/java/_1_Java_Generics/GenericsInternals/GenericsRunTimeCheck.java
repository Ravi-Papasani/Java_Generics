package _1_Java_Generics.GenericsInternals;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunTimeCheck {
    public static void main(String[] args) {

        /*List<String> namesList = new ArrayList<>();
        addToNames(namesList,"Name 1");
        addToNames(namesList,"Name 2");
        System.out.println(namesList);
        incorrectAddToNames(namesList,10); //3rd Element
        System.out.println(namesList);*/
       // String name3 = names.get(2);

        String[] namesArray = new String[5];
        addToArray(namesArray,"Name 1");
        incorrectAddToArray(namesArray,10);
        String anotherName = namesArray[0];
    }

    private static void incorrectAddToArray(Object[] namesArray, Integer i) {
        //namesArray[0] = i;
    }

    private static void addToArray(String[] namesArray, String s) {
        namesArray[0] = s;
    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }

    private static void incorrectAddToNames(List nonGenericList, Integer i) {
        nonGenericList.add(i);
    }
}
