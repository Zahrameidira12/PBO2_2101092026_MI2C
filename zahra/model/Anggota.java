/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra.model;


public class Anggota {
    private String kodeanggota;
    private String namaanggota;
    private String alamat;
    private String jeniskelammin;
    
    //method construktor

    public Anggota() {
    }

    public Anggota(String kodeanggota, String namaanggota, String alamat, String jeniskelammin) {
        this.kodeanggota = kodeanggota;
        this.namaanggota = namaanggota;
        this.alamat = alamat;
        this.jeniskelammin = jeniskelammin;
    }
    
    //method accesor

    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getNamaanggota() {
        return namaanggota;
    }

    public void setNamaanggota(String namaanggota) {
        this.namaanggota = namaanggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelammin() {
        return jeniskelammin;
    }

    public void setJeniskelammin(String jeniskelammin) {
        this.jeniskelammin = jeniskelammin;
    }
    
    
}
