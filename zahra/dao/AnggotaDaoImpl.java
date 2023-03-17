/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra.dao;

/**
 *
 * @author zahra
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import zahra.model.Anggota;


public class AnggotaDaoImpl implements AnggotaDao{

    public void insert(Connection con, Anggota anggota) throws Exception{
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getNamaanggota());
        ps.setString(3, anggota.getJeniskelamin());
        ps.setString(4, anggota.getAlamat());
        ps.executeUpdate();
    }
    
}
