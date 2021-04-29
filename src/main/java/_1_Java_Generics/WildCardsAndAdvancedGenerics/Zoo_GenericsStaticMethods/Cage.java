package _1_Java_Generics.WildCardsAndAdvancedGenerics.Zoo_GenericsStaticMethods;

public class Cage<E extends Animal & Eats & Runs> {
    private E animal1;
    private E animal2;

    public Cage() {
    }

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    public static <E extends Animal> boolean isAnimalSizeCompatible(E animal1, E animal2){
        return animal1.getAnimalSize().equals(animal2.getAnimalSize());
    }

    public void feedAnimal(){
        animal1.eats();
        animal2.eats();
    }
}
