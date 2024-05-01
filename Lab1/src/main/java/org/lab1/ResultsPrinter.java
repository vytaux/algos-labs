package org.lab1;

import java.util.List;
import java.util.Map;

public class ResultsPrinter {

    public static void print(Map<Integer, List<Long>> results) {
        System.out.printf("+-----------+-------------------+-------------------+-------------------+%n");
        System.out.printf("| %-9s | %17s | %17s | %17s |%n", "n-size", "Algorithm #1, ns", "Algorithm #2, ns", "Algorithm #3, ns");
        System.out.printf("+-----------+-------------------+-------------------+-------------------+%n");

        for (Map.Entry<Integer, List<Long>> entry : results.entrySet()) {
            List<Long> value = entry.getValue();
            System.out.printf("| %-9d | %17d | %17d | %17d |%n", entry.getKey(), value.get(0), value.get(1), value.get(2));
        }

        System.out.printf("+-----------+-------------------+-------------------+-------------------+%n");
    }
}
