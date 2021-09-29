package com.tannn2008110324.lab2;
import java.util.Scanner;
public class lap2Bai1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap he so a: ");
        int a=scanner.nextInt();
        System.out.println("nhap he so b");
        int b=scanner.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem ");
            }
            else{
                System.out.println("phuong trinh vo nghiem ");
            }
        }
        else{
            double x=(double)-b/a;
            System.out.println("phuong trinh co nghiem x= " +x);
        }
        
    }
}
