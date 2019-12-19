/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trilogiz;

import java.sql.*;
import com.mysql.jdbc.*;


/**
 *
 * @author ryzen
 */
public class checkingdb {
    boolean checkdbwithdate(String namadb){
    try(Connection conn = DriverManager.getConnection(Trilogiz.HOST,Trilogiz.USER,Trilogiz.PASS)) {
                DatabaseMetaData meta = conn.getMetaData();
                Trilogiz.sttm = conn.createStatement();
                Trilogiz.res = meta.getTables(null, null, namadb, null);
                    if (Trilogiz.res.next()) {
                        System.out.println("Table "+namadb+" exists"); 
                        Trilogiz.sttm.close();
                        conn.close();
                        return true;
                    }else{
                        String createtable;
                        System.out.println("Table "+namadb+" does not exist\nCreating new");
                        createtable = String.format("CREATE TABLE `%s` ( `id` INT(255) NOT NULL , `jenis_bahan` VARCHAR(255) NULL DEFAULT NULL , `ukuran` VARCHAR(255) NULL DEFAULT NULL , `keterangan` TEXT(255) NULL DEFAULT NULL , `nama_customer` VARCHAR(255) NULL DEFAULT NULL , `nama_desainer` VARCHAR(255) NULL DEFAULT NULL , `qty` INT(255) NULL DEFAULT NULL , `pengerjaan` VARCHAR(255) NULL DEFAULT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB",namadb);
                        System.out.println(createtable);
                        Trilogiz.sttm.execute(createtable);
                        Trilogiz.sttm.close();
                        conn.close();
                        return false;
                    }
            } catch (Exception e) {
                e.printStackTrace();
                return false;

            }
    }
}
