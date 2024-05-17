package org.example;

import static org.example.MaxHeapBottomUp.buildMaxHeapBottomUp;

public class Q2 {

    public static void main(String[] args) {
        int[] A = {0, 56, 39, 14, 18, 75};

        HeapResult result = buildMaxHeapBottomUp(A);

        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Data item comparison count: " + result.comparisonCount);
    }
}

