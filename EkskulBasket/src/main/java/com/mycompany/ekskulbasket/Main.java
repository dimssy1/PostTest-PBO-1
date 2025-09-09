package com.mycompany.ekskulbasket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo GK
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> anggotaBasket = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            do
            {
                // Tampilkan menu
                System.out.println("\n=== MENU EKSKUL BASKET ===");
                System.out.println("1. Tambah Anggota");
                System.out.println("2. Lihat Daftar Anggota");
                System.out.println("3. Ubah Nama Anggota");
                System.out.println("4. Hapus Anggota");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu (1-5): ");
                pilihan = input.nextInt();
                input.nextLine(); // Buang newline
                
                // Percabangan berdasarkan pilihan
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama anggota baru: ");
                        String namaBaru = input.nextLine();
                        anggotaBasket.add(namaBaru);
                        System.out.println("Anggota berhasil ditambahkan!");
                    }
                        
                    case 2 -> {
                        System.out.println("\n--- Daftar Anggota Ekskul Basket ---");
                        if (anggotaBasket.isEmpty()) {
                            System.out.println("Belum ada anggota yang terdaftar.");
                        } else {
                            for (int i = 0; i < anggotaBasket.size(); i++) {
                                System.out.println((i + 1) + ". " + anggotaBasket.get(i));
                            }
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Masukkan nomor anggota yang ingin diubah: ");
                        int indexUbah = input.nextInt();
                        input.nextLine(); // Buang newline
                        if (indexUbah > 0 && indexUbah <= anggotaBasket.size()) {
                            System.out.print("Masukkan nama baru: ");
                            String namaUpdate = input.nextLine();
                            anggotaBasket.set(indexUbah - 1, namaUpdate);
                            System.out.println("Nama anggota berhasil diubah!");
                        } else {
                            System.out.println("Nomor anggota tidak valid.");
                        }
                    }
                        
                    case 4 -> {
                        System.out.print("Masukkan nomor anggota yang ingin dihapus: ");
                        int indexHapus = input.nextInt();
                        input.nextLine(); // Buang newline
                        if (indexHapus > 0 && indexHapus <= anggotaBasket.size()) {
                            anggotaBasket.remove(indexHapus - 1);
                            System.out.println("Anggota berhasil dihapus!");
                        } else {
                            System.out.println("Nomor anggota tidak valid.");
                        }
                    }
                        
                    case 5 -> System.out.println("Terima kasih telah menggunakan program ekskul basket!");
                        
                    default -> System.out.println("Pilihan tidak valid. Silakan pilih antara 1 hingga 5.");
                }
                
            } while (pilihan != 5); // Ulangi selama belum memilih keluar
        }
    }
}



