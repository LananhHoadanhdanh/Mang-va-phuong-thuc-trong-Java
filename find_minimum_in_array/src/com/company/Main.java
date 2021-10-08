package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của bạn: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        System.out.println("Nhập các phần tử của mảng: ");
        while (i < array.length) {
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Phần tử có giá trị nhỏ nhất là " + min);
    }
}
