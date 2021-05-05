package Baikiemtra1;

public class ChiTietHoaDon {
	 int MaSanPham;
	  String  TenSP;
	  String SoLuong;
	  int Dongia;

	 public static void main(String[] args) {
		 ChiTietHoaDon c = new ChiTietHoaDon();
	  c. MaSanPham = 001;
	  c.TenSP = "31/10";
	  c.SoLuong = "189";
	 
	  c.Dongia = "123";
	  System.out.println("Ma: " + c.MaSanPham);
	  System.out.println("Ten: " + c.TenSP);
	  System.out.println("Dia chi: " + c.SoLuong);
	  System.out.println("DonGia: " + c.Dongia);
	  

}
