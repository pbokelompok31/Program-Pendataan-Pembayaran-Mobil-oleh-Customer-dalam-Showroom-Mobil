
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
public class Customer {
    private int id_customer;
    String nama_customer;
    private String alamat;
    private int no_tlp;
    JenisKelamin jenis_kelamin;
    Validasi nota;

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(int no_tlp) {
        this.no_tlp = no_tlp;
    }
    public void membeli(Mobil a){
        
    }
    
    public void cetakNota (){
        if (nota==Validasi.LUNAS){
        System.out.println ("Pembayaran Mobil Atas Nama " + nama_customer + " dengan id customer " + id_customer + " sudah lunas");
        System.out.println ("Terima Kasih Telah Melakukan Transaksi");
        System.out.println ("========================================");
        System.out.println ("Detail Nota");
        System.out.println ("Nama : " + nama_customer);
        System.out.println ("Id_customer : " + id_customer);
        System.out.println ("Alamat : " + alamat);
        System.out.println ("No telepon : " + no_tlp);
        System.out.println ("Jenis kelamin : " +jenis_kelamin);
        System.out.println ("status : " +nota);
        System.out.println ("=======================================");
        
        }
        else {
            System.out.println ("maaf pembayaran belum lunas, silahkan lakukan transaksi");
        }
    }
}
