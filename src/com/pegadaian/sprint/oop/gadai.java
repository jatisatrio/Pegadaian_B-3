package com.pegadaian.sprint.oop;

import java.util.ArrayList;
import java.util.Scanner;


public class gadai {
	String nama;
	String produkbarang;
	String deskripsi;
	String status;
	double harga;
	double hutang;
	int Id;

	public static int idPelanggan = 0;
		public static String catEmas = "emas";
		public static String catLaptop = "laptop";
		public static String catMotor = "motor";
		public static ArrayList<gadai> arrayListData = new ArrayList<gadai>();

public String getNama() {
	return nama;
}
public void setNama(String nama) {
	this.nama = nama;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
public double getHutang() {
	return hutang;
}
public void setHutang(double hutang) {
	this.hutang = hutang;
}
public int getIdPelanggan() {
	return Id;
}
public void setIdPelanggan(int idPelanggan) {
	this.Id = idPelanggan;
}

public static void MenuGadai() {
	
	Scanner in = new Scanner(System.in);
	gadai dataGadai = new gadai();	
	
	System.out.println("Detail Information\t");
	System.out.println("=========================");
	System.out.print("Name\t\t\t: ");
	
	dataGadai.Id = idPelanggan;
	idPelanggan++;
	
	boolean bName = false;
	String nama;
	while (!bName)
	{
		nama  = in.nextLine();
		if (nama.length() < 3)
			System.out.println("nama tidak boleh kurang dari 3 karakter");
		else if (nama.length() > 15)
			System.out.println("nama tidak boleh lebih dari 15 karakter");
		else
		{
			bName = true;
			dataGadai.nama = nama;
		}
			
	}
		
	System.out.print("Product Category\t: ");
	
	boolean bCategory = false;
	String category;
	while (!bCategory)
	{
		category = in.nextLine();
		if (category.trim().toUpperCase().equals(catEmas.toUpperCase()) ||  category.trim().toUpperCase().equals(catLaptop.toUpperCase())  || category.trim().toUpperCase().equals(catMotor.toUpperCase()))
			{
			bCategory = true;
			dataGadai.produkbarang = category;
			}
		else
			System.out.println("kategori bukan emas, laptop atau motor");
	}
	
	System.out.print("Description\t\t: ");
	
	boolean bDescription = false;
	String description;
	while (!bDescription)
	{
		description = in.nextLine();
		if (description.contains(" "))
			{
			bDescription = true;
			dataGadai.deskripsi = description;
			}
		else
			System.out.println("deskripsi kurang dari 2 kata!!");
	}
	
	
	System.out.print("Price\t\t\t: ");
	
	boolean bPrice = false;
	double price;
	while (!bPrice)
	{
		price = in.nextDouble();
		if (price%10000 == 0)
		{
			bPrice = true;
			dataGadai.harga = price;
			dataGadai.hutang = price;
		}
		else
			System.out.println("harga tidak kelipatan 10000");
	}
	
	
			
	dataGadai.status = "adai";
	
	arrayListData.add(dataGadai);
		System.out.println(dataGadai.harga);
}
}