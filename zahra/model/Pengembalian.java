/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahra.model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Pengembalian {
    private String kodeanggota;
    private String kodebuku;
    private String tglpinjam;
    private String tgldikembalikan;
    private int terlambat;
    private double denda;

    
    public Pengembalian(String kodeanggota, String kodebuku, String tglpinjam, String tgldikembalikan, int terlambat, double denda) {
        this.kodeanggota = kodeanggota;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }
    
    

    public String getKodeanggota() {
        return kodeanggota;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTgldikembalikan() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date tgl = new Date();
        tgldikembalikan = s.format(tgl);
        return tgldikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }  
    
}
