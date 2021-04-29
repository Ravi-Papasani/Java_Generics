package _1_Java_Generics.GenericsInternals.Zoo;

public class TestCage {
    public static void main(String[] args) {
        Cage<Lion> cageLion = new Cage<>();
        cageLion.setAnimal1(new Lion());
        cageLion.setAnimal2(new Lion());
        Lion animal1 = cageLion.getAnimal1();
        System.out.println(animal1);

        Cage<Monkey> cageMonkey = new Cage<>();
        cageMonkey.setAnimal1(new Monkey());
        //cageMonkey.setAnimal1(new Lion()); //Compile time error, busVehicle object is of Lion type
    }
}
