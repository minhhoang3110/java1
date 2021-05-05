package Baikiemtra1;

public class NhaCungCap {
	 int NhaCungCapID;
	  String NhaCungCapName;
	  String NhaCungCapAddress;

	 public static void main(String[] args) {
		 NhaCungCap c = new NhaCungCap();
	  c.NhaCungCapID = 001;
	  c.NhaCungCapName = "Hoang";
	  c.NhaCungCapAddress = "521 An Duong Vuong";
	 
	  System.out.println("Ma: " + c.NhaCungCapID);
	  System.out.println("Ten: " + c.NhaCungCapName);
	  System.out.println("Dia chi: " + c.NhaCungCapAddress);
	  
	  NhaCungCap c1 = new NhaCungCap();
	  c1.NhaCungCapID = 002;
	  c1.NhaCungCapName = "Phanh";
	  c1.NhaCungCapAddress = "93 Vuong Thua Vu";
	 
	  System.out.println("Ma: " + c1.NhaCungCapID);
	  System.out.println("Ten: " + c1.NhaCungCapName);
	  System.out.println("Dia chi: " + c1.NhaCungCapAddress);
	
	
	 }
	}

