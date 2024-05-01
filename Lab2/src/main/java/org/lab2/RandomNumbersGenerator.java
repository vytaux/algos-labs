package org.lab2;

public class RandomNumbersGenerator {
    
    public static int[] generate(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * n);
        }
        return numbers;
    }
}
