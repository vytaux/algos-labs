package org.example;

public class Q4 {

    public static void main(String[] args) {
        System.out.println("=================== Q1 ================");
        runQ1();
        System.out.println("=================== Q2 ================");
        runQ2();
        System.out.println("=================== Q3 ================");
        runQ3();
    }

    private static int[][] getDataSets() {
        int[] DataSet1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        int[] DataSet2 = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15 };
        int[] DataSet3 = { 0, 4, 2, 3, 1, 5, 8, 7, 6, 11, 10, 12, 9, 13, 14, 16, 15 };
        int[] DataSet4 = { 0, 5, 6, 7, 4, 2, 3, 1, 8, 11, 13, 14, 16, 10, 12, 11, 9 };

        return new int[][] { DataSet1, DataSet2, DataSet3, DataSet4 };
    }

    private static void runQ1() {
        int[][] dataSets = getDataSets();

        for (int i = 0; i < dataSets.length; i++) {
            int[] A = dataSets[i];

            System.out.println("Data set " + (i + 1) + ":");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();

            HeapResult result = MaxHeapTopDown.buildMaxHeapTopDown(A);

            System.out.println("Max heap top down:");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
            System.out.println("Data item comparison count: " + result.comparisonCount);
            System.out.println();
        }
    }

    private static void runQ2() {
        int[][] dataSets = getDataSets();

        for (int i = 0; i < dataSets.length; i++) {
            int[] A = dataSets[i];

            System.out.println("Data set " + (i + 1) + ":");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();

            HeapResult result = MaxHeapBottomUp.buildMaxHeapBottomUp(A);

            System.out.println("Max heap bottom up:");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
            System.out.println("Data item comparison count: " + result.comparisonCount);
            System.out.println();
        }
    }

    private static void runQ3() {
        int[][] dataSets = getDataSets();

        for (int i = 0; i < dataSets.length; i++) {
            int[] A = dataSets[i];

            System.out.println("Data set " + (i + 1) + ":");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();

            MaxHeapBottomUp.buildMaxHeapBottomUp(A);

            System.out.println("Max heap:");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();

            HeapResult result = MaxHeapBottomUp.sort(A);

            System.out.println("Sorted array:");
            for (int j = 1; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
            System.out.println("Data item comparison count: " + result.comparisonCount);
            System.out.println();
        }
    }
}