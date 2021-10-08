package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng các vị tỉ phú: ");
        int size = scanner.nextInt();
	    float[] billionaire = new float[size];
	    int i = 0;
	    while(i < billionaire.length) {
            System.out.println("Nhập số tiền (đơn vị tỉ đô): ");
            billionaire[i] = scanner.nextFloat();
            i++;
        }
	    float max = billionaire[0];
	    for (int j = 0; j < billionaire.length; j++) {
	        if (billionaire[j] > max) {
	            max = billionaire[j];
            }
        }
        System.out.println("Số tiền lớn nhất là " + max + " tỷ USD");
    }
}
