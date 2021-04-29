package _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo_MultiUpperBound;

public class Monkey extends Animal implements Eats,Runs {

    @Override
    public void eats() {
        System.out.println("Monkey Eats");
    }

    @Override
    public void runs() {
        System.out.println("Monkey Runs");
    }
}
