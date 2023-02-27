package AdvancedLiveCodingex18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomArrayList<T> extends ArrayList<T> {
    public CustomArrayList() {
    }

    public CustomArrayList(Collection c) {
        super(c);
    }

    public List<T> getEveryNthElement(int startIndex, int skip) {
        if (startIndex < 0 || startIndex >= size()) {
            throw new IllegalArgumentException("Invalid startIndex");
        }

        if (skip < 0) {
            throw new IllegalArgumentException("Invalid skip");
        }

        List<T> elements = new ArrayList<>();

        for (int i = startIndex; i < size(); i = i + skip + 1) {
            elements.add(get(i));
        }
        return elements;
    }
}
