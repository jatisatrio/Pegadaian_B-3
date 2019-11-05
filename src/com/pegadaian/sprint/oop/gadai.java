package com.pegadaian.sprint.oop;

public class gadai {
String nama;
String produkbarang;
String deskripsi;
double harga;

public gadai(String nama, String produkbarang, String deskripsi, double harga, int idPelanggan) {
	super();
	this.nama = nama;
	this.produkbarang = produkbarang;
	this.deskripsi = deskripsi;
	this.harga = harga;
	IdPelanggan = idPelanggan;
}
public String getNama() {
	return nama;
}
public void setNama(String nama) {
	this.nama = nama;
}
public String getProdukbarang() {
	return produkbarang;
}
public void setProdukbarang(String produkbarang) {
	this.produkbarang = produkbarang;
}
public String getDeskripsi() {
	return deskripsi;
}
public void setDeskripsi(String deskripsi) {
	this.deskripsi = deskripsi;
}
public double getHarga() {
	return harga;
}
public void setHarga(double harga) {
	this.harga = harga;
}
public int getIdPelanggan() {
	IdPelanggan = idPelanggan;
}
int IdPelanggan;
}
