package org.example;

public class Q3 {
    public static void main(String[] args) {
        int[] A = {0, 56, 39, 14, 18, 75};

        MaxHeapBottomUp.buildMaxHeapBottomUp(A);

        System.out.println("Max heap:");
        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        HeapResult result = MaxHeapBottomUp.sort(A);

        System.out.println("Sorted array:");
        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Data item comparison count: " + result.comparisonCount);
    }
}