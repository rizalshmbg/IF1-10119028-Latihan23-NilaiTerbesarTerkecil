/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author NAMA : Rizal Sihombing
 * KELAS : IF1
 * NIM : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai terbesar & nilai terkecil
 */
public class IF110119028Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int i, jum_nilai, terbesar = 0, terkecil = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jum_nilai = scanner.nextInt();
        int nilai_mhs[] = new int[jum_nilai];
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa Ke-%d: ", i+1);
            if (nilai_mhs[i] < terkecil) {
                terkecil = nilai_mhs[i];
            }
            nilai_mhs[i]= scanner.nextInt();
            if (nilai_mhs[i] > terbesar) {
                terbesar = nilai_mhs[i];
            }
        }

        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n", i+1, nilai_mhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+terbesar);
        System.out.println("Nilai Terkecil Adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);

    }
}