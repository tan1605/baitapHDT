package com.tannn2008110324.lab1;
import java.util.Scanner;
public class lap1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho va ten ");
        String hoTen=scanner.nextLine();
        System.out.println("Diem TB: ");
        double diemTB=scanner.nextDouble();
        System.out.println("Ho va ten :" + hoTen + "Diem" + diemTB);
    }
}