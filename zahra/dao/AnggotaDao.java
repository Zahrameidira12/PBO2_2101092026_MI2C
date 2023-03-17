/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra.dao;

import zahra.dao.AnggotaDao;
import java.sql.Connection;
import zahra.model.Anggota;
/**
 *
 * @author zahra
 */
public interface AnggotaDao {
    void insert(Connection con, Anggota anggota) throws Exception;
    
}