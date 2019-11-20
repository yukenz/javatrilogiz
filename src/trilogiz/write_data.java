/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trilogiz;
import com.mysql.jdbc.*;
import java.sql.*;
import java.util.Arrays;
/**
 *
 * @author ryzen
 */
public class write_data {
    String tablename;
    String[] nametable;
    String[] namedata;

    write_data(String[] nametable, String[] namedata,String tablename) {
        this.tablename = tablename;
        this.nametable = nametable;
        this.namedata = namedata;
    }
    
    String getnametable(){
        String returner=Arrays.toString(nametable).replace("[", "").replace("]", "");
    return returner;
    }
    String getnamedata(){
        String returner=Arrays.toString(namedata).replace("[", "").replace("]", "");
    return returner;
    }
    
    
    void write_data(){
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s", tablename));
                String SQLQuery;
                if(Trilogiz.res.next()){
                Trilogiz.res.last();
                SQLQuery = String.format("INSERT INTO %s(id, %s) VALUES(%d, %s)", tablename, getnametable(),Trilogiz.res.getInt("id")+1,getnamedata());
                }else{
                SQLQuery = String.format("INSERT INTO %s(id, %s) VALUES(%d, %s)", tablename, getnametable(),0,getnamedata());
                }
                System.out.println(SQLQuery);
                Trilogiz.sttm.execute(SQLQuery);
                Trilogiz.sttm.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    static boolean update_data_status(String tablenamein,String status, int harga, int potongan_harga,int id){
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s", tablenamein));
                String SQLQuery;
                Trilogiz.res.last();
                SQLQuery = String.format("UPDATE `%s` SET `pengerjaan` = '%s', `harga` = '%d', `potongan_harga` = '%d' WHERE `id` = %d", tablenamein, status, harga, potongan_harga, id);
                System.out.println(SQLQuery);
                Trilogiz.sttm.execute(SQLQuery);
                Trilogiz.sttm.close();
                conn.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }    
    }
    static boolean updatedata_barang(String tablenamein,String jenis_bahan, String ukuran, String keterangan, String namacust, String namasetter, int qty,int id){
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s", tablenamein));
                String SQLQuery;
                Trilogiz.res.last();
                SQLQuery = String.format("UPDATE `%s` SET `jenis_bahan` = '%s', `ukuran` = '%s', `keterangan` = '%s', `nama_customer` = '%s', `nama_setter` = '%s', `qty` = '%d' WHERE `id` = %d", tablenamein, jenis_bahan, ukuran, keterangan, namacust, namasetter, qty, id);
                System.out.println(SQLQuery);
                Trilogiz.sttm.execute(SQLQuery);
                Trilogiz.sttm.close();
                conn.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }    
    }
    
}
