/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom_mobil;

import java.util.ArrayList;

/**
 *
 * @author THIS-PC
 */
public class Showroom {
    private String nama_pemilik;
    String alamat_pemilik;
    int no_tlp;
    ArrayList <Pegawai> daftarPeg = new ArrayList <Pegawai>();
    ArrayList <Mobil> daftarMbl = new ArrayList <Mobil>();

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }
    
    public void tambahPeg(Pegawai peg){
        daftarPeg.add(peg);
    }
    public void hapusPeg (Pegawai peg){
        daftarPeg.remove(peg);
    }
    String cariPegawai (String nama){
        for (Pegawai peg:daftarPeg)
            if(nama.equalsIgnoreCase(peg.nama_pegawai)){
                return ("Pegawai dengan nama "+peg.nama_pegawai +" ada");
            }
        return ("Data pegawai tidak ada");
    }
    public void tambahMbl(Mobil mbl){
        daftarMbl.add(mbl);
    }
    public void hapusMbl (Mobil mbl){
        daftarMbl.remove(mbl);
    }
}
