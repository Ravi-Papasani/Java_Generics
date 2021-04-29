package _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo;

public class ConstructorTestCage {
    public static void main(String[] args) {
        Cage<Monkey> cageMonkey = new Cage<Monkey>(new Monkey(), new Monkey());

        cageMonkey.getAnimal1();

    }
}
