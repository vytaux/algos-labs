package org.example;

import java.util.*;

public class Q3 {

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
            Queue<Integer> Q = new LinkedList<>();
            Q.add(unvisitedNode);
            component.add(unvisitedNode);

            while (!Q.isEmpty()) {
                int v = Q.remove();

                List<Integer> vertices = findAllUnvisitedAdjacentVertices(A, v, visited);

                for (int w : vertices) {
                    visited[w] = true;
                    Q.add(w);
                    component.add(w);
                }
            }

            // Component found, save it to results
            components.add(component);

            // select next unvisited node, for the next component
            unvisitedNode = findNextUnvisitedVertex(visited);
        } while (unvisitedNode != null);

        return components;
    }

    private static List<Integer> findAllUnvisitedAdjacentVertices(int[][] A, int v, boolean[] visited) {
        List<Integer> vertices = new ArrayList<>();

        for (int neighbor = 0; neighbor < A.length; neighbor++) {
            if (A[v][neighbor] != 0 && !visited[neighbor]) {
                vertices.add(neighbor);
            }
        }

        return vertices;
    }

    private static Integer findNextUnvisitedVertex(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return null;
    }
}