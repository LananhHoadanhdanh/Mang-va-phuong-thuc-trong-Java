package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng của ma trận: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vào chiều dài của ma trận: ");
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        System.out.println("Nhập các phần tử của ma trận: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Nhập giá trị của arr[" + i + "][" + j +"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Giá trị lớn nhất trong ma trận là " + max);
    }
}
