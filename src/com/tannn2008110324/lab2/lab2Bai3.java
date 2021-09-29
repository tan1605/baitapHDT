package com.tannn2008110324.lab2;
import java.util.Scanner;
public class lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so dien su dung cua thang nay: ");
        double soDien= scanner.nextDouble();
        if(soDien<50){
            double tien= soDien*1000;
            System.out.println("tien dien thang nay la:" +tien);
        }
        else{
            double tien= 50*1000 + (soDien-50)*1200;
            System.out.println("tien dien thang nay la:" +tien);
        }
    }
}
