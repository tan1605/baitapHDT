package com.tannn2008110324.lab1;
import java.util.Scanner;
public class lap1Bai2{
    public static void main(String[]args) {
        double chuVi, dienTich, canhNhoNhat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu dai hinh chu nhat:");
        double chieuDai=scanner.nextDouble();
        System.out.println("nhap chieu rong hinh chu nhat:");
        double chieuRong=scanner.nextDouble();

        chuVi=(chieuDai+chieuRong)*2;
        dienTich=chieuDai*chieuRong;
        canhNhoNhat=Math.min(chieuDai, chieuRong);

        System.out.println("chu vi hinh chu nhat la: " +chuVi);
        System.out.println("dien tich hinh chu nhat la: " +dienTich);
        System.out.println("canh nho nhat la: " +canhNhoNhat);
        
    }
}