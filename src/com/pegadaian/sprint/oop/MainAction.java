package com.pegadaian.sprint.oop;

import java.util.Scanner;

public class MainAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean inputCheck = false;
		while (inputCheck == false) {
			Scanner in = new Scanner(System.in);
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("\tPegadaian System");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. Gadai");
			System.out.println("2. Tebus");
			System.out.println("3. Tampilkan Inventory");
			System.out.println("4. Exit");
			System.out.println("--------------------------------------------------------");
			System.out.print("Opsi: ");
			try {
				int opsi = in.nextInt();

				if (opsi == 1) {
					System.out.println("Detail Information\t");
					System.out.println("=========================");
					System.out.println("Name\t\t\t: ");
					System.out.println("Product Category\t: ");
					System.out.println("Description\t\t: ");
					System.out.println("Price\t\t\t: ");
				} else if (opsi == 2) {
					System.out.println("ini pilihan 2");
				} else if (opsi == 3) {
					System.out.println("ini pilihan 3");
				} else if (opsi == 4) {
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Maaf input anda salah! Silahkan ulangi kembali!");
			}

		}

	}

}
