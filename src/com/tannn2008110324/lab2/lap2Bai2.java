package com.tannn2008110324.lab2;
import java.util.Scanner;
public class lap2Bai2 {
     public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap he so a: ");
        int a=scanner.nextInt();
        System.out.println("nhap he so b");
        int b=scanner.nextInt(); 
        System.out.println("nhap he so c");
        int c=scanner.nextInt();
        
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("phuong trinh co vo so nghiem ");
                }
                else{
                    System.out.println("phuong trinh vo nghiem ");
                }
            }
            else{
                double x=(double)-b/a;
                System.out.println("phuong trinh cos nghiem x= " +x);
            }
        }
        else{
            double delta= (b*b)-4*a*c;
            if(delta<0){
                System.out.println("phuong trinh vo nghiem ");
            }
            else if (delta==0) {
                double x= -b/(2*a);
                System.out.println("phuong trinh co nghiem kep x=" +x);
            } else {
                double x1= (-b+Math.sqrt(delta))/(2*a);
                double x2= (-b-Math.sqrt(delta))/(2*a);
                System.out.println("phuong trinh co hai nghiem phan biet");
                System.out.println("x1=" +x1);
                System.out.println("x2=" +x2);
            }

            
        }
     }   
}
