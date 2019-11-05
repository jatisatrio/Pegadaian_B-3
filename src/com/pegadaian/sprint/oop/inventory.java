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
	
//	public static void inventory(){
//		int jumlahbarang = 0; 
//		for (gadai data : gadai.arrayListData) {
//			if (data.getStatus().trim().equals("Gadai")) {
//				jumlahbarang+=1;
//		        String leftAlignFormat = "| %-15s | %-5s | %-9s | %-5d |%n";
//				System.out.println(data.getIdPelanggan()+ " "+data.getNama()+" "+data.getProdukbarang()+" "+data.getDeskripsi()+" "+data.getHarga());
//			}
//		}
//		if (jumlahbarang==0) {
//			System.out.println("Tidak ada barang gadai di inventori");
//		}
//	}
	
	public static void inventory() {
		if (gadai.arrayListData.isEmpty()) {
			System.out.println("Tidak ada barang gadai di inventori");
		} else {
			for (Integer i = 0; i < gadai.arrayListData.size(); i++) {

				if (gadai.arrayListData.get(i).status.toUpperCase().equals("GADAI")) {
					System.out.printf("%-4s | %-15s | %-6s | %-9s | %-9s |%n", gadai.arrayListData.get(i).Id,
							gadai.arrayListData.get(i).nama, gadai.arrayListData.get(i).produkbarang,
							gadai.arrayListData.get(i).deskripsi, gadai.arrayListData.get(i).harga);
				} else if (!gadai.arrayListData.get(i).status.toUpperCase().equals("GADAI")) {
					System.out.println("Tidak ada barang gadai di inventori");
				}
			}
		}
	}	
	
	static void printHeader() {
        String leftAlignFormat = "| %-15s | %-6s | %-9s | %-5s | %-7s |%n";

        printLine();
        System.out.format(leftAlignFormat, "ID", "Nama", "Produk", "Deskripsi", "Harga");
        printLine();
    }

    static void printLine() {
        System.out.format("+-----------------+--------+-----------+-----------+---------+%n");
    }

    void printRow() {
        String leftAlignFormat = "| %-15s | %-5s | %-9s | %-5d |%n";
        System.out.format(leftAlignFormat, IdPelanggan, nama, produk, Deskripsi, Harga);
    }
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getProduk() {
		return produk;
	}
	public void setProduk(String produk) {
		this.produk = produk;
	}
	public String getDeskripsi() {
		return Deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		Deskripsi = deskripsi;
	}
	public Double getHarga() {
		return Harga;
	}
	public void setHarga(Double harga) {
		Harga = harga;
	}
}
