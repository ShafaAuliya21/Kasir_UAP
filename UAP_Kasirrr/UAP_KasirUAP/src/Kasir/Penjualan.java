/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author Shafa Auliya
 */

import Kasir.ProductCounter;
import Kasir.Produk;
import java.util.ArrayList;

public class Penjualan implements ProductCounter {
    private ArrayList<Produk> Produk = new ArrayList<Produk>();
    private int jumlahProduk;
    private int stok;

    public Penjualan(int jumlahProduk, int stok) {
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }

    public ArrayList<Produk> getProduk() {
        return Produk;
    }
    
    public int getJumlahProduk() {
        return jumlahProduk;
    }
    
    public int getStok() {
        return stok;
    }
    
    @Override
    public int hitungJumlahProduk() {
        return jumlahProduk;
    }
    
    @Override
    public int hitungHargaProduk() {
        return 0;
    }    
    
}