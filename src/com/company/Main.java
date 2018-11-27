package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        double average = 0;
        int[] array= new int[n];
        for (int i = 0; i <n; i++) {
            array[i] = (int)(Math.random()*45 -20);
        }
        System.out.println("Array:");
        System.out.println(Arrays.toString(array) + "\n");
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        average = (double)sum / n;
        System.out.println(" average of the el. in array: " + average + "\n");
    }
}
