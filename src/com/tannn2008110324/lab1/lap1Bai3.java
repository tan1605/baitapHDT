package com.tannn2008110324.lab1;
import java.util.Scanner;
public class lap1Bai3{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("canh cua khoi lap phuong la: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh,3);
        System.out.println("the tich cua khoi lap phuong la: " +theTich);

    }
}