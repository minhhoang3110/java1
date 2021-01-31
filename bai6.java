package src;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong: ");
        int a = sc.nextInt();
        int b = 1;
        int i = 1;
        do{
            b*=i;
            i++;
        }while(i<=a);
        System.out.println("Giai thua la: "+b);
        sc.close();
    }
}