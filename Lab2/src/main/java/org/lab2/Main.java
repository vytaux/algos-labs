package org.lab2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running");

        // Run first as a warmup to avoid the spikes
        warmup();

        for (int n = 10000000; n <= 100000000; n += 10000000) {
            int[] randomNumbers = RandomNumbersGenerator.generate(n);
            
            Timer.start();
            Algorithm1.thirdLargest(randomNumbers);
            Results.put(n, Timer.stop());

            Timer.start();
            Algorithm2.thirdLargest(randomNumbers);
            Results.put(n, Timer.stop());
        }

        ResultsPrinter.print(Results.results);
    }

    private static void warmup() {
        for (int n = 100000; n <= 1000000; n += 100000) {
            int[] randomNumbers = RandomNumbersGenerator.generate(n);

            Algorithm1.thirdLargest(randomNumbers);
            Algorithm2.thirdLargest(randomNumbers);
        }
    }
}