package com.pegadaian.sprint.oop;

import java.util.Arrays;
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
					gadai.MenuGadai();
				} else if (opsi == 2) {
					tebus.tampilan();
				} else if (opsi == 3) {
					inventory.inventory();
				} else if (opsi == 4) {
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Maaf input anda salah! Silahkan ulangi kembali!");
			}

		}

	}

}
