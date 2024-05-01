package org.lab2;

public class Algorithm1 {
    public static int thirdLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;

        // First loop to find the maximum element
        for (int num : arr) {
            if (num > firstMax) {
                firstMax = num;
            }
        }

        int secondMax = Integer.MIN_VALUE;

        // Second loop to find the second maximum element
        for (int num : arr) {
            if (num != firstMax && num > secondMax) {
                secondMax = num;
            }
        }

        int thirdMax = Integer.MIN_VALUE;

        // Third loop to find the third maximum element
        for (int num : arr) {
            if (num != firstMax && num != secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}