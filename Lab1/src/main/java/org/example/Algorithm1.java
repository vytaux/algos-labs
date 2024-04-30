package org.example;

public class Algorithm1 {
    public static int[] removeDups(int[] A, int n) {
        for(int i = n - 1; i >= 0; i--){
            for(int j = n - 1; j > i + 1; j--){
                if(A[j] == A[i]){
                    A = removeLast(A, A[i]);
                    n--;
                    break;
                }
            }
        }
        return A;
    }

    public static int[] removeLast(int[] arr, int a) {
        int pos = -1;
        int k = arr.length;
        int[] newArr = new int[k - 1];
        int i = k - 1;

        // get index
        while( pos < 0){
            if(a == arr[i]){
                pos = i;
                break;
            }else{
                i--;
            }
        }

        // remove duplicated value
        for (int j = 0; j < k - 1; j++) {
            if (j < pos) {
                newArr[j] = arr[j];
            } else {
                newArr[j] = arr[j + 1];
            }
        }

        return newArr;
    }
}