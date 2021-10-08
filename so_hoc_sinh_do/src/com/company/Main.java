package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studens = 1;
        do {
            System.out.println("Nhập số lượng học sinh: ");
            studens = scanner.nextInt();
            if (studens > 30) {
                System.out.println("Số học sinh không quá 30 người.");
            }
        }
        while (studens > 30);
        int[] scores = new int[studens];
        int i = 0;
        while (i < studens) {
            System.out.print("Nhập điểm cho học sinh thứ " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            i++;
        }
        int count = 0;

        System.out.println("List of mark: ");
        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j] + "\t");
            if (scores[j] >= 5 && scores[j] <= 10)
                count++;
        }
        System.out.println("\n" + "Số lượng học sinh đỗ là: " + count + " học sinh.");
    }
}
