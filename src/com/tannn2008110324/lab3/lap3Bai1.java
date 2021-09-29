package com.tannn2008110324.lab3;
import java.util.Scanner;
public class lap3Bai1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("nhap a de kiem tra xem co phai la so nguyen to: ");
        int a = in.nextInt();
        boolean ok = true;
        for (int i = 2;i<a;i++)
            if(a%i==0)
            {
                ok = false;
                break;
            }
        if(ok==true)
            System.out.println("a la so nguyen to ");
        else
            System.out.println("a khong phai la so nguyen to ");
    }
}
