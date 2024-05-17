package org.example;

import java.util.*;

public class Utils {

    static void printComponents(List<Set<Integer>> components) {
        List<Set<String>> componentFormatted = mapNodesToLetters(components);

        for (Set<String> component : componentFormatted) {
            System.out.println(component);
        }
    }

    private static List<Set<String>> mapNodesToLetters(List<Set<Integer>> component) {
        Map<Integer, String> nodeToLetter = new HashMap<>() {
            {
                put(0, "A");
                put(1, "B");
                put(2, "C");
                put(3, "D");
                put(4, "E");
                put(5, "F");
                put(6, "G");
                put(7, "H");
                put(8, "I");
            }
        };

        List<Set<String>> visitedNodesMapped = new ArrayList<>();

        for (Set<Integer> nodes : component) {
            Set<String> nodesMapped = new LinkedHashSet<>();
            for (Integer node : nodes) {
                nodesMapped.add(nodeToLetter.get(node));
            }
            visitedNodesMapped.add(nodesMapped);
        }

        return visitedNodesMapped;
    }
}
