package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] flowers = {"Chi tử", "Dành dành", "Anh đào", "Bỉ ngạn", "Mạn châu sa"};
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].equals(flower)) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println(flower + " có trong danh sách.");
        } else {
            System.out.println(flower + " không có trong danh sách.");
        }
    }
}
