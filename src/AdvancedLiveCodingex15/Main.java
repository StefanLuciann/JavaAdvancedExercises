package AdvancedLiveCodingex15;

import java.util.List;

/**
 * Design the Joiner class, which in the constructor will take a separator (string) and have a join()
 * method that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString()
 * method and separating them with a separator. eg. for Integers and separator "-" it should return: 1-2-3-4 ...
 */
public class Main {
    public static void main(String[] args) {
        Joiner<Integer> intJoiner = new Joiner<>("-");
        System.out.println(intJoiner.join(List.of(1, 5, 3, -33)));

        Joiner<String> intJoiner1= new Joiner<>("-");
        System.out.println(intJoiner1.join(List.of("cc","aa","ee","ff")));

        Joiner<Person> joinPerson = new Joiner<>("\n");
        System.out.println(joinPerson.join(List.of(new Person("Alin","12 martie"),new Person("Andrei","30 iulie"))));

        SortedJoin<Integer> sortedIntegerJoiner = new SortedJoin<>("-");
        System.out.println(sortedIntegerJoiner.sortedJoiner(List.of(1, 5, 3, -33)));

        SortedJoin<Person> sortPersons = new SortedJoin<Person>("\n");
        System.out.println(sortPersons.sortedJoiner(List.of(new Person("Axel","12 martie"),new Person("Andrei","30 iulie"))));
    }
}
