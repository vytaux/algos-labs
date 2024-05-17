package org.example;

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        int[][] A = {
            {0, 2, 2, 0, 0, 2, 0, 0, 0},  // A
            {2, 0, 0, 0, 0, 2, 0, 0, 0},  // B
            {2, 0, 0, 0, 0, 2, 2, 0, 0},  // C
            {0, 0, 0, 0, 1, 0, 0, 0, 1},  // D
            {0, 0, 0, 1, 0, 0, 0, 0, 1},  // E
            {2, 2, 2, 0, 0, 0, 0, 2, 0},  // F
            {0, 0, 2, 0, 0, 0, 0, 2, 0},  // G
            {0, 0, 0, 0, 0, 2, 2, 0, 0},  // H
            {0, 0, 0, 1, 1, 0, 0, 0, 0}   // I
        };

        List<Set<Integer>> components = findComponents(A);

        Utils.printComponents(components);
    }

    public static List<Set<Integer>> findComponents(int[][] A) {
        List<Set<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[A.length];

        Integer unvisitedNode = findNextUnvisitedVertex(visited);
        do {
            Set<Integer> component = new LinkedHashSet<>();
            Stack<Integer> S = new Stack<>();
            S.push(unvisitedNode);
            component.add(unvisitedNode);

            while (!S.isEmpty()) {
                int v = S.peek();

                Integer w = findUnvisitedAdjacentVertex(A, v, visited);

                if (w != null) {
                    visited[w] = true;
                    S.push(w);
                    component.add(w);
                } else {
                    S.pop();
                }
            }

            // Component found, save it to results
            components.add(component);

            // select next unvisited node, for the next component
            unvisitedNode = findNextUnvisitedVertex(visited);
        } while (unvisitedNode != null);

        return components;
    }

    private static Integer findNextUnvisitedVertex(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return null;
    }

    private static Integer findUnvisitedAdjacentVertex(int[][] A, int node, boolean[] visited) {
        for (int neighbor = 0; neighbor < A.length; neighbor++) {
            if (A[node][neighbor] != 0 && !visited[neighbor]) {
                return neighbor;
            }
        }

        return null;
    }
}