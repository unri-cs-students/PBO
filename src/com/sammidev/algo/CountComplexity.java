package com.sammidev.algo;

/**
 * Created by sam on 08/03/21.
 */
public class CountComplexity {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int[] numbers = {2,3,4,2,3,6,8,10,21,2,3};
        int hasil = arrayMax(numbers, numbers.length);
        System.out.println(hasil);

        long elapsedTime= System.nanoTime() - startTime;
        System.out.println("execution time in nanosecond : " + elapsedTime);
    }

    static int arrayMax(int[] numbers, int length) {
        int currentMax = numbers[0]; // 2
        for (int i = 0; i < length; i++) { // 2n
            if (numbers[i] > currentMax) { // 2(n-1)
                currentMax = numbers[i];   // 2(n-1)
            }
        }
        // total = 6n-1
        return currentMax;
    }
}

