/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studi.kasus1;

/**
 *
 * @author Ananta D.
 */
public class Inventory {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    // perubahan pada menampilkan stok barang
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].ambilStokBarang() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].ambilStokBarang() + ")");
    }
    
    void pengadaan() {
        initBarang();
        
        // soal
        // barangs[0].stok += 20;
        // barangs[0].stok -= 30; // bisa juga dikurangi dong?
        // barangs[0].stok *= 30; // dikali juga bisa dong?
        
        // solusi
        barangs[0].tambahBarang(20);
        showBarang();
    }
    
    public static void main(String[] args) {
        Inventory beli = new Inventory();
        beli.pengadaan();
    }
}
