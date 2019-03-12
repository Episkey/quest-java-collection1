import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        Hero oneHero = new Hero("Black Widow", 34);
        Hero oneHero2 = new Hero("Captain America", 100);
        Hero oneHero3 = new Hero("Vision", 3);
        Hero oneHero4 = new Hero("Iron Man", 48);
        Hero oneHero5 = new Hero("Scarlet Witch", 29);
        Hero oneHero6 = new Hero("Thor", 1500);
        Hero oneHero7 = new Hero("Spider-man", 18);
        Hero oneHero8 = new Hero("Hulk", 49);
        Hero oneHero9 = new Hero("Doctor Strange", 42);

        ArrayList<Hero> marvelHero = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        marvelHero.add(oneHero);
        marvelHero.add(oneHero2);
        marvelHero.add(oneHero3);
        marvelHero.add(oneHero4);
        marvelHero.add(oneHero5);
        marvelHero.add(oneHero6);
        marvelHero.add(oneHero7);
        marvelHero.add(oneHero8);
        marvelHero.add(oneHero9);

        // TODO 3 : It's Thor birthday, now he's 1501

        oneHero6.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(marvelHero);

        // TODO 5 : Keep only the half of the list

        List<Hero> marvelHero2 = marvelHero.subList(4, 8);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        for (Hero hero : marvelHero2) {
            System.out.println(hero.getName());
        }

    }
}