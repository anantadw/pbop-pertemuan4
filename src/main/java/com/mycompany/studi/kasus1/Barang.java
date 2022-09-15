/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studi.kasus1;

/**
 *
 * @author Ananta D
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public void tambahBarang(int jml_barang) {
        stok += jml_barang;
    }
    
    public int ambilStokBarang() {
        return stok;
    }
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
