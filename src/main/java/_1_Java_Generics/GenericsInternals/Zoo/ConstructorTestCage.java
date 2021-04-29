package _1_Java_Generics.GenericsInternals.Zoo;

public class ConstructorTestCage {
    public static void main(String[] args) {
        //without Generics in the right hand side accepts both Lion() and Monkey()
        Cage<Lion> cageLion = new Cage(new Lion(), new Monkey());
        //Generics declared as Lion type on right hand side, strictly accepts Lion()
        Cage<Lion> cageLion1 = new Cage<Lion>(new Lion(), new Lion());
        //Compilation error when Monkey() passed for Lion generic type
        //Cage<Lion> cageLion2 = new Cage<Lion>(new Lion(), new Monkey());

        Lion animal1 = cageLion.getAnimal1();
        System.out.println(animal1);
    }
}
