package org.lab2;

public class Algorithm1 {
    public static int thirdLargest(int[] A) {
        int firstMaxIndex = 0;

        // Find the maximum element
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[firstMaxIndex]) {
                firstMaxIndex = i;
            }
        }

        int secondMaxIndex = 0;

        // Find the second maximum element
        for (int j = 0; j < A.length; j++) {
            if (j != firstMaxIndex && A[j] > A[secondMaxIndex]) {
                secondMaxIndex = j;
            }
        }

        int thirdMaxIndex = 0;

        // Find the third maximum element
        for (int k = 0; k < A.length; k++) {
            if (k != firstMaxIndex && k != secondMaxIndex && A[k] > A[thirdMaxIndex]) {
                thirdMaxIndex = k;
            }
        }

        return A[thirdMaxIndex];
    }
}