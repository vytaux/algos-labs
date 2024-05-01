package org.lab2;

public class Algorithm1 {
    public static int thirdLargest(int[] A) {
        int firstMax = 0;

        // First loop to find the maximum element
        for (int num : A) {
            if (num > firstMax) {
                firstMax = num;
            }
        }

        int secondMax = 0;

        // Second loop to find the second maximum element
        for (int num : A) {
            if (num != firstMax && num > secondMax) {
                secondMax = num;
            }
        }

        int thirdMax = 0;

        // Third loop to find the third maximum element
        for (int num : A) {
            if (num != firstMax && num != secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}