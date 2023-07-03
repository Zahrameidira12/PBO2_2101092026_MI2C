/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra.controlller;

import zahra.dao.AnggotaDao;
import zahra.dao.AnggotaDaoImpl;
import zahra.dao.Koneksi;
import zahra.model.Anggota;
import zahra.view.FormAnggota;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    private Connection con;
    private Koneksi koneksi;
    
    public AnggotaController(FormAnggota formAnggota){
        try {
            this.formAnggota = formAnggota;
            anggotaDao = new AnggotaDaoImpl();
            koneksi = new Koneksi ();
            con = koneksi.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void clearForm(){
        formAnggota.getTxtKodeanggota().setText("");
        formAnggota.getTxtNamaanggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void isiCboJeniskelamin(){
        formAnggota.getCboJeniskelamin().removeAllItems();
        formAnggota.getCboJeniskelamin().addItem("L");
        formAnggota.getCboJeniskelamin().addItem("P");
    }
    
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(formAnggota.getTxtKodeanggota().getText());
            anggota.setNamaanggota(formAnggota.getTxtNamaanggota().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJeniskelammin(formAnggota.getCboJeniskelamin().getSelectedItem().toString());
            anggotaDao.insert(con, anggota);
            JOptionPane.showMessageDialog(formAnggota, "Entri OK");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(formAnggota.getTxtKodeanggota().getText());
            anggota.setNamaanggota(formAnggota.getTxtNamaanggota().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJeniskelammin(formAnggota.getCboJeniskelamin().getSelectedItem().toString());
            anggotaDao.update(con, anggota);
            JOptionPane.showMessageDialog(formAnggota, "Update OK");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(){
        try {
            anggotaDao.delete(con, anggota);
            JOptionPane.showMessageDialog(formAnggota, "Delete OK");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tabelKlik(){
        try {
            String kode = formAnggota.getTblAnggota().getValueAt(formAnggota.getTblAnggota().getSelectedRow(),0).toString();
            anggota = anggotaDao.getAnggota(con, kode);
            formAnggota.getTxtKodeanggota().setText(anggota.getKodeanggota());
            formAnggota.getTxtNamaanggota().setText(anggota.getNamaanggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJeniskelamin().setSelectedItem(anggota.getJeniskelammin());
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cari(){
        try {
            String kode = formAnggota.getTxtKodeanggota().getText();
            anggota = anggotaDao.getAnggota(con, kode);
            if(anggota != null){
                formAnggota.getTxtNamaanggota().setText(anggota.getNamaanggota());
                formAnggota.getTxtAlamat().setText(anggota.getAlamat());
                formAnggota.getCboJeniskelamin().setSelectedItem(anggota.getJeniskelammin());
            }else{ 
                JOptionPane.showMessageDialog(formAnggota, "Data Tidak Data");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void tampil(){
        try {
            DefaultTableModel tabel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
            tabel.setRowCount(0);
            List<Anggota> list = anggotaDao.getAllAnggota(con);
            for(Anggota anggota1 : list){
                //array yg datanya langsung diisi
                Object[] row = {
                    anggota1.getKodeanggota(),
                    anggota1.getNamaanggota(),
                    anggota1.getAlamat(),
                    anggota1.getJeniskelammin()
                };
                tabel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
