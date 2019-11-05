package com.pegadaian.sprint.data;

public class Product {
String produk;
Double harga;
String status;
public Product(String produk, Double harga, String status) {
	super();
	this.produk = produk;
	this.harga = harga;
	this.status = status;
}
public String getProduk() {
	return produk;
}
public void setProduk(String produk) {
	this.produk = produk;
}
public Double getHarga() {
	return harga;
}
public void setHarga(Double harga) {
	this.harga = harga;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
