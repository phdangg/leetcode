package Array_Hashing;

import java.util.*;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        if (paths.size() == 1) return paths.get(0).get(1);
        Map<String, String> mp = new HashMap<>();
        for (List<String> row : paths) {
            mp.put(row.get(0),row.get(1));
        }
        for (List<String> row : paths) {
            if (!mp.containsKey(row.get(1))) return row.get(1);
        }
        return "";
    }

    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        one.add("B"); one.add("C");
        two.add("D"); two.add("B");
        three.add("C"); three.add("A");
        List<List<String>> input = new ArrayList<>();
        input.add(one);
        input.add(two);
        input.add(three);

        System.out.println(destCity(input));

    }
}