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
		public static boolean contains(final int[] array, final int v) {

	        boolean result = false;

	        for(int i : array){
	            if(i == v){
	                result = true;
	                break;
	            }
	        }

	        return result;
	    }
		
		public static  void tampilan (){
			Scanner in = new Scanner (System.in);
			int[] id = {1,2};
			 try {
				tampilanDataTebus();
				
				while (true){
					System.out.print("Masukkan ID barang yang ingin di tebus: \n");
					int idBarang = in.nextInt();
					if (contains(id, idBarang)){
						System.out.println("Masukkan biaya yang ingin diterima: ");
						double angsuranUser = in.nextDouble();
						tampilanDataTebus();
						break;
					}
				}
				
			} catch (Exception e){
				System.out.println("Maaf input anda salah!");
			}
			
		}
}
