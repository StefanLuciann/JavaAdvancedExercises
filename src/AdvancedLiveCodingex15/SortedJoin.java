package AdvancedLiveCodingex15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedJoin <T extends Comparable<T>>{

    private String separator;

    public SortedJoin(String separator) {
        this.separator = separator;
    }

    public String sortedJoiner(List<T> list){
        String result = "";
        List<T> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < sortedList.size(); i++) {
            result += sortedList.get(i).toString();
            if (i < list.size() - 1) {
                result = result + separator;
            }
        }
        return result;
    }
}
