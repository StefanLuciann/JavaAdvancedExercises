package AdvancedLiveCodingex15;

import java.util.List;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> list) {
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).toString();
            if (i < list.size() - 1) {
                result = result + separator;
            }
        }
        return result;
    }
}
