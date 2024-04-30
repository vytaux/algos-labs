package org.example;

public class Algorithm3 {
    public static int[] removeDups(int[] A, int n) {
        int[] W = new int[2 * n];
        int[] B = new int[n];
        int index = 0;
        for(int i = 0; i < n; i++){
            int u = A[i];
            if(W[u] == 0){ // means new value
                B[index] = A[i];
                index++;
                W[u] = 1;
            }
        }

        int[] C = new int[index];
        for(int j = 0; j < index; j++){
            C[j] = B[j];
        }
        return C;
    }
}