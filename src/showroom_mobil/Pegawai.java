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
public class Pegawai {
    private int id_pegawai;
    String nama_pegawai;
    String alamat;
    JenisKelamin jenis_kelamin;
    ArrayList <Customer> daftarCustomer = new ArrayList <Customer>();
    Validasi val;
   
    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }
    
    public void tambahCus(Customer cus){
        daftarCustomer.add(cus);
    }
    public void hapusCus (Customer cus){
        daftarCustomer.remove(cus);
    }
    
    String cariCustumer (String nama){
        for (Customer cus:daftarCustomer)
            if(nama.equalsIgnoreCase(cus.nama_customer)){
                return ("Customer dengan nama "+cus.nama_customer + " ada ");
            } 
        return ("Customer dengan nama tersebut tidak ada");
    }
    
    public void memvalidasi (){
        if(val == Validasi.LUNAS)
            System.out.println ("Data Customer Ada dan pembayaran mobil sudah lunas");
        else if (val == Validasi.DP)
            System.out.println ("Data Customer Ada dan pembayaran mobil masih DP");
        else 
            System.out.println ("Data Customer Ada Pembayaran belum lunas");
    }

}
