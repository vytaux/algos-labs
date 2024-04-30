package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running comparisons of 3 algorithms from 1000 to 10000 elements: ");

        // Run first as a warmup to avoid the spikes
        warmup();

        for (int n = 1000; n <= 10000; n += 1000) {
            int[] randomNumbers = RandomNumbersGenerator.generate(n);
            
            Timer.start();
            Algorithm1.removeDups(randomNumbers, n);
            Results.put(n, Timer.stop());

            Timer.start();
            Algorithm2.removeDups(randomNumbers, n);
            Results.put(n, Timer.stop());

            Timer.start();
            Algorithm3.removeDups(randomNumbers, n);
            Results.put(n, Timer.stop());
        }

        ResultsPrinter.print(Results.results);
    }

    private static void warmup() {
        for (int n = 10000; n <= 100000; n += 10000) {
            int[] randomNumbers = RandomNumbersGenerator.generate(n);

            Algorithm1.removeDups(randomNumbers, n);
            Algorithm2.removeDups(randomNumbers, n);
            Algorithm3.removeDups(randomNumbers, n);
        }
    }
}