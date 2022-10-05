package core.java.basics;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mathankumar", 32);
        map.put("Ramya", 30);
        map.put("Dhanya", 6);
        sortMap(map);
    }

    private static void sortMap(Map<String, Integer> map) {

//        Comparator<Map.Entry<String, Integer>> reverseComparator = Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
        list.stream()
            .forEach((entry) -> {
                result.put(entry.getKey(), entry.getValue());
            });
        System.out.println(result);
    }
}
