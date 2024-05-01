package org.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Results {

    static Map<Integer, List<Long>> results = new TreeMap<>();

    public static void put(int nSize, long elapsedMs) {
        results.computeIfAbsent(nSize, k -> new ArrayList<>())
                .add(elapsedMs);
    }
}
