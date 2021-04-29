package _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo_GenericsStaticMethods;

import _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo_GenericsStaticMethods.Cage;

public class GenericStaticMethod {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Cage.isAnimalSizeCompatible(monkey1,monkey2);
    }
}
