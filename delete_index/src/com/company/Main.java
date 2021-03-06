package com.company;
import java.util.Scanner;
public class Main {

    public static int findIndex(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {10,4,8,6,2,7,9,0};
        int[] newArr = new int[array.length-1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần xóa: ");
        int number = scanner.nextInt();
        int index = findIndex(array, number);
        if (index != -1) {
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = array[i];
                } else {
                    newArr[i] = array[i + 1];
                }
            }
            System.out.println("Mảng mới: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        } else {
            System.out.println("Không có giá trị đó trong mảng");
        }
    }
}
