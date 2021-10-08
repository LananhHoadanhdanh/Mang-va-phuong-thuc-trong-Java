package com.company;

public class Main {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int result = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là " + result);
    }
}
