package core.java.basics;

import java.util.*;

public class Misc {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 2, 5, 5, 7, 1, 3, 5, 6, 8);
        new HashSet<>(numbers).stream()
                              .sorted()
                              .skip(2)
                              .limit(1)
                              .forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> first = numbers2.stream()
                                          .filter(n -> n % 2 != 0)
                                          .sorted(Comparator.reverseOrder())
                                          .findFirst();

        if(first.isPresent()){
            System.out.println(first.get());
        }
    }
}
