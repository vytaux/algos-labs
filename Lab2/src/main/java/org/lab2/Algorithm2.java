package org.lab2;

public class Algorithm2 {
    public static int thirdLargest(int[] A) {
        if (arr.length < 3) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        int prePreMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                prePreMax = preMax;
                preMax = max;
                max = num;
            } else if (num > preMax && num < max) {
                prePreMax = preMax;
                preMax = num;
            } else if (num > prePreMax && num < preMax) {
                prePreMax = num;
            } else if (num == max || num == preMax) {
                if (num == max && preMax < num) {
                    prePreMax = preMax;
                    preMax = num;
                } else if (num == preMax && prePreMax < num) {
                    prePreMax = num;
                }
            }
        }

        return prePreMax;
    }
}