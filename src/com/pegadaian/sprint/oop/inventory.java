package com.pegadaian.sprint.oop;


public class inventory {
	int IdPelanggan;
	String nama;
	String produk;
	String Deskripsi;
	Double Harga;
	public int getIdPelanggan() {
		return IdPelanggan;
	}
	public void setIdPelanggan(int idPelanggan) {
		IdPelanggan = idPelanggan;
	}
	public static void inventory(){
		int jumlahbarang = 0; 
		for (gadai data : gadai.arrayListData) {
			if (data.getStatus().trim().equals("Gadai")) {
				jumlahbarang+=1;
		        String leftAlignFormat = "| %-15s | %-5s | %-9s | %-5d |%n";
				System.out.println(data.getIdPelanggan()+ " "+data.getNama()+" "+data.getProdukbarang()+" "+data.getDeskripsi()+" "+data.getHarga());
		        //System.out.format(leftAlignFormat, data.getNama() + data.getProdukbarang() + data.getDeskripsi() + data.getHarga());
			}
		}
		if (jumlahbarang==0) {
			System.out.println("Tidak ada barang gadai di inventori");
		}
	}
	
	
}
