/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom_mobil;

/**
 *
 * @author THIS-PC
 */
public class Mobil {
    private int id_mobil;
    String nama_mobil;
    JenisMobil jenis_mobil;
    String warna;
    int harga;
    JenisMobil mbl;

    public int getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(int id_mobil) {
        this.id_mobil = id_mobil;
    }

    public void HargaMobil (){
        if(mbl == JenisMobil.MANUAL){
            System.out.println ("=======================================");
            System.out.println ("Nama mobil : " +nama_mobil);
            System.out.println ("Harga mobil :" +harga);
            System.out.println ("Jenis mobil :" +jenis_mobil);
            System.out.println ("Warna :" +warna);
            System.out.println ("=======================================");
        } else if (mbl == JenisMobil.MATIC)
            System.out.println ("=======================================");
            System.out.println ("Nama mobil : " +nama_mobil);
            System.out.println ("Harga mobil :" +harga);
            System.out.println ("Jenis mobil :" +jenis_mobil);
            System.out.println ("Warna :" +warna);
            System.out.println ("=======================================");
    }

    
}
