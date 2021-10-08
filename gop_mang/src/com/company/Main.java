package com.company;
public class Main {

    public static void main(String[] args) {
	int[] array1 = {1,2,3,4,5,6};
	int[] array2 = {6,5,4,3,2,1};
	int[] arraySum = new int[array1.length+ array2.length];
        for (int i = 0; i < array1.length; i++) {
            arraySum[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            arraySum[array1.length+j] = array2[j];
        }
        System.out.println("Mảng mới: ");
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + "\t");
        }
    }
}
