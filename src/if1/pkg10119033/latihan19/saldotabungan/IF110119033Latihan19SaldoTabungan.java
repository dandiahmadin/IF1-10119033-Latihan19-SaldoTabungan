/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung saldo tabungan dengan bunga majemuk
 */
public class IF110119033Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
        
    public static int lama = 6,
                    saldo = 2500000;  
    public static double bunga = 0.15;
    
    public static double bungaMajemuk() {
        return bunga * saldo;
    }
    
    public static void tampilSaldo() {
        System.out.println("==========Tabungan Anda==========");
        for (int i = 1; i <= lama; i++) {
            saldo += bungaMajemuk();
            System.out.printf("Saldo di bulan ke-" + i + " Rp.%,d %n",saldo);
        
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilSaldo();
    }
    
}
