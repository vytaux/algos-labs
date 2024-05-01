package org.lab1;

public class Algorithm2 {
    public static int[] removeDups(int[] A, int n) {
        int[] B = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean dupFound = false;
            for (int j = 0; j < i; j++) {
                if (A[j] == A[i]) {
                    dupFound = true;
                    break;
                }
            }
            if (!dupFound) {
                B[index] = A[i];
                index++;
            }
        }

        int[] C = new int[index];
        for (int j = 0; j < index; j++) {
            C[j] = B[j];
        }

        return C;
    }
}