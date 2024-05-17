package org.example;

public class Q1 {
    public static void main(String[] args) {
        int[] A = { 0, 56, 39, 14, 18, 75 };

        HeapResult result = MaxHeapTopDown.buildMaxHeapTopDown(A);

        for (int i = 1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Data item comparison count: " + result.comparisonCount);
    }
}