package _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo_MultiUpperBound;

public class Lion extends Animal implements Eats,Runs{
    @Override
    public void eats() {
        System.out.println("Lion Eats");
    }

    @Override
    public void runs() {
        System.out.println("Lion Runs");
    }
}
