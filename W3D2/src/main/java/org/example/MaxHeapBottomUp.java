package org.example;

public class MaxHeapBottomUp {

    public static HeapResult sort(int[] A) {
        HeapResult result = new HeapResult(A);

        for (int i = A.length - 1; i > 1; i--) {
            swapElem(A, 1, i);
            downHeap(result, 1, i - 1);
        }

        return result;
    }

    public static HeapResult buildMaxHeapBottomUp(int[] A) {
        HeapResult result = new HeapResult(A);

        for (int i = A.length / 2; i > 0; i--) {
            downHeap(result, i, A.length);
        }

        return result;
    }

    private static void downHeap(HeapResult result, int i, int n) {
        int j = i;
        int k = maxChildIndex(result, j, n);

        while (k != 0) {
            swapElem(result.array, j, k);
            j = k;
            k = maxChildIndex(result, j, n);
        }
    }

    private static int maxChildIndex(HeapResult result, int j, int n) {
        int[] A = result.array;
        int k = j;

        if (2 * j < n) {
            System.out.println("comparing " + A[2 * j] + " " + A[k]);

            if (A[2 * j] > A[k]) {
                System.out.println("swapping " + A[2 * j] + " " + A[k]);
                k = 2 * j;
            }
            result.comparisonCount++;
        }

        if (2 * j + 1 < n) {

            System.out.println("comparing " + A[2 * j + 1] + " " + A[k]);

            if (A[2 * j + 1] > A[k]) {
                System.out.println("swapping " + A[2 * j + 1] + " " + A[k]);
                k = 2 * j + 1;
            }
            result.comparisonCount++;
        }

        if (k == j) {
            return 0;
        }

        return k;
    }

    private static void swapElem(int[] A, int parentIdx, int childIdx) {
        int temp = A[childIdx];
        A[childIdx] = A[parentIdx];
        A[parentIdx] = temp;
    }
}
