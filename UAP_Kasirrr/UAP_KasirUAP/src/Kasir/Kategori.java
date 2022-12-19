/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Shafa Auliyya
 */

public class Kategori{
    private String nama_kategori;
    Produk produk = new Produk();

    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public Produk getProduk(){
        return produk;
    }
    
}