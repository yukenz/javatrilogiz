/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trilogiz;
import com.mysql.jdbc.*;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author ryzen
 */
public class read_data {
    String tablename;
    String[] getdata;
    String[] datatype;
    
    read_data(String[] getdata, String[] datatype, String tablename){
    this.getdata = getdata;
    this.datatype = datatype;
    this.tablename = tablename;
    }

    static String[] singlereaddata(int tgl,int id){
        String[] returner = new String[9];
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s WHERE id=%d", "barang"+tgl,id));
                Trilogiz.mtdt = Trilogiz.res.getMetaData();
                if(Trilogiz.res.next()){
                    returner[0] = Trilogiz.res.getString("nama_customer");
                    returner[1] = Trilogiz.res.getString("jenis_bahan");
                    returner[2] = Trilogiz.res.getString("ukuran");
                    returner[3] = Trilogiz.res.getString("nama_setter");
                    returner[4] = Trilogiz.res.getString("qty");;
                    returner[8] = Trilogiz.res.getString("keterangan");
                }
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s WHERE id=%d", "status"+tgl,id));
                if(Trilogiz.res.next()){
                    returner[5] = Trilogiz.res.getString("pengerjaan");
                    returner[6] = Trilogiz.res.getString("harga");
                    returner[7] = Trilogiz.res.getString("potongan_harga");
                }
                Trilogiz.sttm.close();
                conn.close();
                return returner;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
        }
    
    }
    
    String[][] read_data(){
        String[][] returner;
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s", tablename));
                Trilogiz.mtdt = Trilogiz.res.getMetaData();
                returner = array_setread_data(getdata, datatype);
                Trilogiz.sttm.close();
                conn.close();
                return returner;
            } catch (Exception e) {
                e.printStackTrace();
                return returner=null;
        }
    }
    
    
    String[][] array_setread_data(String[] getdata, String[] datatype) throws SQLException{
            if(Trilogiz.res.last()){
            int maxrow = Trilogiz.res.getInt("id");
            int maxcol = Trilogiz.mtdt.getColumnCount();
            String[][] returner = new String[maxrow+1][maxcol];
            Trilogiz.res.beforeFirst();
            int x = 0;
            while (Trilogiz.res.next()) {
                for (int i = 0; i < getdata.length; i++) {
                    switch(datatype[i]){
                        case "int":
                            System.out.println(getdata[i]+" = "+Trilogiz.res.getInt(getdata[i]));
                            returner[x][i]=Integer.toString(Trilogiz.res.getInt(getdata[i]));
                            break;
                        case "string":
                            System.out.println(getdata[i]+" = "+Trilogiz.res.getString(getdata[i]));
                            returner[x][i]=Trilogiz.res.getString(getdata[i]);
                            break;
                    }
                }
                x++;
                System.out.println("=======================================");
            }
            return returner;
            }
            return null;
    }
    
    int statuslogin(String username_input,String password_input){
    String passwordnya;
        try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT * FROM %s WHERE username='%s'", "user", username_input));
                //Trilogiz.mtdt = Trilogiz.res.getMetaData();
                Trilogiz.res.next() ;               
                System.out.println(Trilogiz.res.getString("password"));
                passwordnya = Trilogiz.res.getString("password");
                Trilogiz.job = Trilogiz.res.getInt("status");
                Trilogiz.namauser = Trilogiz.res.getString("nama");
                Trilogiz.username = Trilogiz.res.getString("username");
                Trilogiz.sttm.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                passwordnya=null;
        }
        if(password_input.equals(passwordnya)){
            return 1;
        }else if(password_input.isEmpty()||username_input.isEmpty()){
            return 2;
        }else{
            return 0;
        }
    }
    
    static int getlastid(String tablename,JLabel x){
    int id=0;
    try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = Trilogiz.sttm.executeQuery(String.format("SELECT `id` FROM `%s`", tablename));
                //Trilogiz.mtdt = Trilogiz.res.getMetaData();
                if(Trilogiz.res.last()){
                id = Trilogiz.res.getInt("id");
                x.setText(Integer.toString(id+1));
                }else{
                x.setText(Integer.toString(id));
                }
                Trilogiz.sttm.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                id=-1;
        }
    return id;
    }
    
}
