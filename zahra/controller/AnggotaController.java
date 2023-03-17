/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import zahra.dao.AnggotaDao;
import zahra.dao.Koneksi;
import zahra.model.Anggota;
import zahra.view.FormAnggota;

/**
 *
 * @author zahra
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotadao;
    private Connection con;
    private Koneksi koneksi;
    
    
    
    public AnggotaController(FormAnggota formAnggota ){
        try {
            this.formAnggota = new FormAnggota();
            AnggotaDoaImpl anggotaDao = new AnggotaDoaImpl(); 
            con = new Koneksi().getKoneksi();
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
        
        public void bersihForm(){
            formAnggota.getTxtKodeAnggota().setText("");
            formAnggota.getTxtNamaAnggota().setText("");            
        }
        
        public void isiCboJenisKelamin(){
            formAnggota.getCboJenisKelamin().removeAllItems();
            formAnggota.getCboJenisKelamin().addItem("L");
            formAnggota.getCboJenisKelamin().addItem("P");
        }
    }
    
    

