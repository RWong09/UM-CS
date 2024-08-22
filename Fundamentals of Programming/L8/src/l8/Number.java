/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l8;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class Number {
    private int[] numbers;

    public Number(int n) {
        numbers = generateRandom(n, 0, 100);
    }

    public Number(int n, int max) {
        numbers = generateRandom(n, 0, max);
    }

    public Number() {
        numbers = generateRandom(10, 0, 100);
    }

    private static int[] generateRandom(int n, int min, int max) {
        int[] array = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public void displayAllNumber() {
        System.out.println("All numbers: " + Arrays.toString(numbers));
    }
    public void evenNumber() {
        System.out.print("Even numbers: ");
        for (int i : numbers) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            } else
                continue;
        }
        System.out.println();
    }

    public void primeNumber() {
        System.out.print("Prime numbers: ");
        for (int i : numbers) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            } 
        }
        return true;
    }

    public void maxNumber() {
        int max = numbers[0];
        for (int i : numbers){
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum numbers: " + max);
    }

    public void minNumber() {
        int min = numbers[0];
        for (int i : numbers){
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Maximum numbers: " + min);
    }

    public void average(){
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average+=numbers[i];
        }
        System.out.println("Average: " + (average /= numbers.length));
    }

    public void squareNumber() {
        System.out.print("Square number: ");
        int square=0;
        for (int i : numbers) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt) && i != 0) {
                System.out.print(i + " ");
                square++;
            }
        }
        if(square==0){
            System.out.println("No square numbers found in the set.");
        }
        else{
            System.out.println();
        }
    }
    
}
