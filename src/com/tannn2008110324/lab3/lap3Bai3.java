package com.tannn2008110324.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class lap3Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a;
        int sum=0,count=0;
        float tbsum;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = in.nextInt();
        a = new int[n];
        for(int i = 0;i<n;i++){
            System.out.printf("Nhap vao phan tu a[%d] ",i);
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Mang duoc sap xep la: "+Arrays.toString(a));
        System.out.println("Phan tu cos gia tri nho nhat la: "+a[0]);
        for(int i=0;i<n;i++){
            if(a[i]%3==0){
                sum=sum+a[i];
                count++;
            }
        }
        tbsum=sum/count;
        System.out.println("trung binh cong cua cac so chia het cho 3 trong mang la "+tbsum);
    }
}
