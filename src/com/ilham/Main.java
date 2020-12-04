/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        int saldoAwal = scanner.nextInt();
        
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        System.out.print("Jumlah uang yang diambil : ");
        int ambilSaldo = scanner.nextInt();
        
        tabungan.ambilUang(ambilSaldo);
        
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(ambilSaldo));
    }
    
}
