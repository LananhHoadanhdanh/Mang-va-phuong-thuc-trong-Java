package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của ma trận vuông: ");
        int x = scanner.nextInt();
        int[][] arr = new int[x][x];
        System.out.println("Nhập các phần tử của ma trận: ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Nhập giá trị của arr[" + i + "][" + j +"]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(arr[i][j] + "\t");
                if (i == j || j == (arr.length - 1 - i)) {
                    sum += arr[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("Tổng các phần tử trong đường chéo là " + sum);
    }
}
