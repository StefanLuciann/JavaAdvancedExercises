package AdvancedLiveCodingex1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter,
 * then returns the list sorted alphabetically from Z to A.
 */
public class Main {
    public static void main(String[] args) {
        List<String> litere= Arrays.asList("Cristi","Ana","Alex","Rares","costel");
        List<String> namesSorted= sortListDescendingOrderCaseInsensitive(litere);
        System.out.println(namesSorted);
    }

    public static List<String> sortListDescendingOrder(List<String> list){
        List<String> newList= new ArrayList<>(list);
        newList.sort((o1, o2)-> o2.compareTo(o1));
        return newList;
    }

    public static List<String> sortListDescendingOrderV2(List<String> list){
        return list.stream().
                sorted((o1,o2)-> o2.compareTo(o1))
                .collect(Collectors.toList());
    }

    public static List<String> sortListDescendingOrderCaseInsensitive(List<String> list) {
        return list.stream().
                sorted((o1, o2) -> o2.compareToIgnoreCase(o1))
                .collect(Collectors.toList());
    }
}