/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studi.kasus2;

/**
 *
 * @author Ananta D.
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
    
    public Item(String name) {
        this(); // memanggil this() untuk menjalankan private constructor
        System.out.println(this.name);
    }
}
