package org.example;

public class MaxHeapTopDown {

    public static HeapResult buildMaxHeapTopDown(int[] A) {
        HeapResult result = new HeapResult(A);

        for (int i = 1; i < A.length; i++) {
            upHeap(result, i);
        }

        return result;
    }

    private static void upHeap(HeapResult result, int i) {
        int[] A = result.array;

        int j = i;
        while (j > 1 && A[j/2] < A[j]) {
            System.out.println("comparing " + A[j/2] + " " + A[j]);

            if (A[j/2] < A[j]) {
                swapElem(A, j, j/2);
                j = j/2;
            }
            result.comparisonCount++;
        }
    }

    private static void swapElem(int[] A, int parentIdx, int childIdx) {
        int temp = A[childIdx];
        A[childIdx] = A[parentIdx];
        A[parentIdx] = temp;
    }
}
