package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của ma trận: ");
        int x = scanner.nextInt();
        System.out.println(" Nhập vào chiều rộng của ma trận");
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                int number = scanner.nextInt();
                arr[i][j] = number;
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < y ; i++) {
            for (int j = 0; j < x; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    int indexY = i;
                    int indexX = j;
                }
            }
        }

    }
}
