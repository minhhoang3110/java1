package baitap1;

import java.util.Scanner;
import java.util.Math;
public class bai1{
    public static void main(String[] args){
        DIEM diem = new DIEM();
        diem.nhap();
        diem.xuat();
        diem.diemDoixung();
        diem.khoangCachhaidiem();
        diem.kiemTra();
    }
}
class DIEM{
    
    int x,y;
   
    int x1,y1;
  
    double delta, dttamgiac;
    Scanner scan = new Scanner(System.in);
  
    void nhap(){
        System.out.println("Nhap vao hoanh do  x: ");
        x = scan.nextInt();
        System.out.println("Nhap vao tung do y: ");
        y = scan.nextInt();
    }
  
    void xuat(){
        System.out.println("Toa do cua diem la : ("+ x + "," + y +")");
    }
   
    void diemDoixung(){
        x1 = x;
        y1 = -y;
        System.out.println("Toa do cua diem doi xung la: (" +x1 +"," + y1 +")");
    }
   
    void khoangCachhaidiem(){
        delta = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        System.out.println("Khoang cach giua hai diem la : " +delta);
    }
   
    void kiemTra(){
        if( x==0 || y==0 ){
            System.out.println("Diem nay nam tren truc toa do");
        }else{
            System.out.println("Diem nay khong nam tren truc toa do");
            dttamgiac = 0.5 * delta *x ;
            System.out.println("Dien tich tam giac: " +dttamgiac);
        }
    }