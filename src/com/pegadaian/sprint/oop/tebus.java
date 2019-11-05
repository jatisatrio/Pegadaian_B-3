package com.pegadaian.sprint.oop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tebus {

		int idPelanggan;
		String produk;
		double harga;
		String status;
		double utang;

		public tebus (){
			
		}
		public tebus(int idPelanggan, String produk, double harga, String status, double utang) {
			super();
			this.idPelanggan = idPelanggan;
			this.produk = produk;
			this.harga = harga;
			this.status = status;
			this.utang = utang;
		}

		public int getIdPelanggan() {
			return idPelanggan;
		}

		public void setIdPelanggan(int idPelanggan) {
			this.idPelanggan = idPelanggan;
		}

		public String getProduk() {
			return produk;
		}

		public void setProduk(String produk) {
			this.produk = produk;
		}

		public double getHarga() {
			return harga;
		}

		public void setHarga(double harga) {
			this.harga = harga;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public double getUtang() {
			return utang;
		}

		public void setUtang(double utang) {
			this.utang = utang;
		}

		public double hutangLunas(double angsuran) {
			double sisaHutang = this.utang - angsuran;
			return sisaHutang;
		}
		
		public static void tampilanDataTebus (){
			System.out.println("__________________________________________");
			System.out.println("|" + " ID " + "|" + " Product " + "|" + " Price " + "|" + " Status " + "|"
					+ " Loan " + "|");
			System.out.println("___________________________________________");
		}

		public static boolean validateId(int id) {
			boolean valid = false;
			
			for(Integer i = 0; i < gadai.arrayListData.size(); i++) {
				if(gadai.arrayListData.get(i).IdPelanggan == id) {
					valid = true;
					break;
				}
			}
			
			return valid;
		}
		
		
		public static void tampilan(){
			Scanner in = new Scanner(System.in);
			try {
				tampilanDataTebus();
				
				while (true){
					System.out.print("Masukkan ID barang yang ingin di tebus: \n");
					int idBarang = in.nextInt();
					if (validateId(idBarang)){
						System.out.println("Masukkan biaya yang ingin diterima: ");
						double angsuranUser = in.nextDouble();
						if (validateUtang(idBarang, angsuranUser)){
							System.out.println("Pembayaran berhasil");
						}
						tampilanDataTebus();
						break;
					}
				}
				
			} catch (Exception e){
				System.out.println("Maaf input anda salah!");
			}
			
		}
		
		public static boolean validateHarga(int id, int harga) {
			boolean valid = false;
			
			for(Integer i = 0; i < gadai.arrayListData.size(); i++) {
				if(gadai.arrayListData.get(i).IdPelanggan == id) {
					if(gadai.arrayListData.get(i).harga <= harga) {
						valid = true;
						break;
					}
				}
			}
			
			return valid;
		}
		
		public static boolean validateUtang(int id, double utang) {
			Boolean valid = false;
			
			for(Integer i = 0; i < gadai.arrayListData.size(); i++) {
				if(gadai.arrayListData.get(i).IdPelanggan == id) {
					if(gadai.arrayListData.get(i).utang <= utang) {
						valid = true;
						gadai.arrayListData.get(i).utang = gadai.arrayListData.get(i).utang - utang;
						break;
					}
				}
			}
			return valid;
		}
}
