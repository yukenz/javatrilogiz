/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trilogiz;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author ryzen
 */
public class Trilogiz {

    /**
     * @param args the command line arguments
     */
    final public static String JDBC_DRIVER="com.mysql.jdbc";
    final public static String HOST="jdbc:mysql://remotemysql.com/vJeYJF0Vnz";
    final public static String USER="vJeYJF0Vnz";
    final public static String PASS="8SrYmarR6n";
    //public static Connection conn;
    public static Statement sttm;
    public static ResultSet res;
    public static ResultSetMetaData mtdt;
    public static LocalDate tanggal = LocalDate.now();
    public static String tanggalsekarang = tanggal.toString().replace("-", "");
    //public static String tanggalsekarang = "20191031";
    
    //biodata
    public static int job = 0;
    public static String namauser;
    public static String username;
    
    public static int idtersedia;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Sekarang tanggal "+tanggal.toString());
        System.out.println("Checking database untuk tanggal sekarang");
        new checkingdb().checkdbwithdate("barang"+tanggalsekarang);
        new checkingdb().checkdbwithdate("status"+tanggalsekarang);
        
        /*
        write_data writebarang = new write_data(new String[]{"jenis_bahan","ukuran","keterangan","nama_customer","nama_setter","qty"},new String[]{"'chromo'","'5x5cm'","'GAADA'","'Ryuuzaki'","'Yuyun'","10"},"barang"+tanggalsekarang);
        writebarang.write_data();
        write_data writestatus = new write_data(new String[]{"pengerjaan","harga","potongan_harga"},new String[]{"'pengerjaan'","10000","1000"},"status"+tanggalsekarang);
        writestatus.write_data();
        
        
        read_data readbarang = new read_data(new String[]{"id","jenis_bahan","ukuran","keterangan","nama_customer","nama_setter","qty"},new String[]{"int","string","string","string","string","string","int"},"barang"+tanggalsekarang);
        readbarang.read_data();
        read_data readstatus = new read_data(new String[]{"id","pengerjaan","harga","potongan_harga"},new String[]{"int","string","int","int"},"status"+tanggalsekarang);
        readstatus.read_data();
        */
        
        new loginframe().setVisible(true);
        
    }
    
}
