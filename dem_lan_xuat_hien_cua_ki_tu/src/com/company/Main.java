package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String phrase;
        char character = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        phrase = scanner.nextLine();

        for (int i = 0; i < phrase.length(); i++) { //Hàm str.length() trả về tổng số ký tự trong một chuỗi
            if (phrase.charAt(i) == character) { //Hàm str.charAt(i) trả về ký tự ở vị trí thứ i trong chuỗi
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + character +
                " trong chuỗi " + phrase + " = " + count);
    }
}
