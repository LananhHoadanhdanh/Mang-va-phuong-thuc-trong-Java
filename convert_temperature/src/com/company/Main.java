package com.company;
import java.util.Scanner;
public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 1.8;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1. Chuyển từ độ C sang độ F: ");
            System.out.println("2. Chuyển từ độ F sang độ C: ");
            System.out.println("0. Kết thúc chương trình.");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số độ C: ");
                    double tempC = scanner.nextDouble();
                    double resultC = celsiusToFahrenheit(tempC);
                    System.out.println(tempC + " độ C = " + resultC + " độ F.");
                case 2:
                    System.out.println("Nhập số độ F: ");
                    double tempF = scanner.nextDouble();
                    double resultF = fahrenheitToCelsius(tempF);
                    System.out.println(tempF + " độ F = " + resultF + " độ C.");
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có tùy chọn.");
            }
        }
    }
}
