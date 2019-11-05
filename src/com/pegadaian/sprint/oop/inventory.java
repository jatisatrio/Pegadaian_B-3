package com.pegadaian.sprint.oop;

public class inventory {
	int IdPelanggan;
	String nama;
	String produk;
	String deskripsi;
	Double harga;

//formatting
	static void namaKolom() {
		String formatter = "| %-15s | %-6s | %-10s | %-5s |%n";
        System.out.println("-------------------------------------------------");
        System.out.format(formatter,"ID", "Nama", "Product", "Description","Price");
        System.out.println("-------------------------------------------------");
    }
	
    void dataTable() {
        String formatter = "| %-15s | %-5s | %-10s | %-5d |%n";
        System.out.format(formatter, IdPelanggan, nama, produk, deskripsi, harga);
    }
	
//setter getter
	public int getIdPelanggan() {
		return IdPelanggan;
	}
	public void setIdPelanggan(int idPelanggan) {
		IdPelanggan = idPelanggan;
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
		return deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	public Double getHarga() {
		return harga;
	}
	public void setHarga(Double harga) {
		this.harga = harga;
	}

}