package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int[] array = {10,4,6,7,8,9};
	    int[] result = new int[array.length+1];
        System.out.println("Nhập vị trí bạn muốn thêm: ");
        int index = scanner.nextInt();
        System.out.println("Nhập giá trị bạn muốn thêm: ");
        int value = scanner.nextInt();
        if (index>=0 && index < array.length) {
            for (int i = 0; i <= array.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else if ( i== index) {
                    result[i] = value;
                } else {
                    result[i] = array[i-1];
                }
            }
            System.out.println("Mảng mới: ");
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[j] + "\t");
            }
        } else {
            System.out.println("Nhập lỗi.");
        }
    }
}
