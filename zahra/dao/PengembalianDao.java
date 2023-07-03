/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zahra.dao;

import java.sql.Connection;
import java.util.List;
import zahra.model.Peminjaman;
import zahra.model.Pengembalian;


public interface PengembalianDao {
    public void insert(Connection con, Pengembalian pengembalian) throws Exception;
    public void update(Connection con, Pengembalian pengembalian) throws Exception;
    public void delete(Connection con, Pengembalian pengembalian) throws Exception;
    public Pengembalian getPengembalian(Connection con, String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Pengembalian> getAllPeminjaman(Connection con) throws Exception;
}
