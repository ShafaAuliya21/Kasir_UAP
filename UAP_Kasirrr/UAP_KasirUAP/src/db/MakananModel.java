package db;

import Kasir.Makanan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;

import db.DBHelper;

import Kasir.Makanan;

/**
 *
 * @author Shafa Auliya
 */

public class MakananModel {
    private final Connection CONN;

    public MakananModel(){
        this.CONN = DBHelper.getConnection();
    }

    public void addMakanan(Makanan makanan){
        String insert = "INSERT INTO makanan  VALUES ("
                        + makanan.getId() + ", " +
                        makanan.getDaya_tahan() + ", '" +
                        makanan.getNama_produk() + "', " +
                        makanan.getHarga() + ", " +
                        makanan.getJumlah() + " , " +
                        makanan.getDiskon() + ");";
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }
            else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException e) {
            System.out.println("Gagal Memasukkan Data" + e.getMessage());
        }
    }

    public void deleteMakanan(Makanan makanan){
        String delete = "DELETE FROM Makanan WHERE Makanan.nama_produk = '"
                        + makanan.getNama_produk()+ "';";
        
        try {
            if(CONN.createStatement().executeUpdate(delete) > 0){
                System.out.println("Berhasil Menghapus Data");
            }
            else{
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException e) {
            System.out.println("Gagal Menghapus Data" + e.getMessage());
        }
    }
    
    public ArrayList<Makanan> getMakanan(){
        String query = "SELECT Makanan.nama_produk, Makanan.harga FROM Makanan UNION SELECT Barang.nama_produk, Barang.harga FROM Barang;";
        ArrayList<Makanan> makanan = new ArrayList<Makanan>();
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Makanan temp = new Makanan( rs.getString("nama_produk"), rs.getDouble("harga"), rs.getInt("jumlah"), rs.getDouble("diskon"), rs.getInt("id"), rs.getInt("daya_tahan"));
                makanan.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } 
        catch (SQLException e) {
            System.out.println("Gagal Mengambil Data"+ e.getMessage());
        }
        
        return makanan;
    }
}