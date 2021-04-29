package _1_Java_Generics.GenericsBasics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsBasicsDemo {
    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        //names.add(new Date()); //converting Date object to String type gives you ClassCastException
        names.add("Name 1");
        names.add("Name 2");

        //TypeCasting object into String type
        String firstName = (String) names.get(0);
        System.out.println(firstName);


        //Same Above code can be well written using Generics
        ArrayList<String> nms = new ArrayList<String>();

        //nms.add(new Date()); compilation error
        nms.add("genericsName 1");
        nms.add("genericsName 2");

        //TypeCasting not required using Generics
        String genericsName = nms.get(0);
        System.out.println(genericsName);

        //Generics using Date
        ArrayList<Date> dt = new ArrayList<Date>();
        dt.add(new Date());

        Date date = dt.get(0);
        System.out.println(date);
    }
}
