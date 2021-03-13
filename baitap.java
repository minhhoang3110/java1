package SanPham;

public class baitap {
	String tenSp = "laptop" ;
	double donGia = 15000000; 
	double giamGia = 10;
	static double getThueNhapKhau(double t)
	{
		return (t * 10)/100;
	}
	void xuat() {
		System.out.println("Ten san pham: "+ this.tenSp);
		System.out.println("Don gia: "+ this.donGia + "$");
		System.out.println("Giam gia: " + this.giamGia + "%");
		
	}

	public static void main(String[] args) {
		baitap SanPham = new baitap();
		SanPham.xuat();
		double thue = getThueNhapKhau(10);
		System.out.println("Thue nhap khau: " +thue+ "$");
	
	}

}


