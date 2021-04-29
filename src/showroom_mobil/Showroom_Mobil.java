/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom_mobil;

import java.util.Scanner;

/**
 *
 * @author THIS-PC
 */
public class Showroom_Mobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        
    /* 
    //Cari Customer
     Customer cus1 = new Customer();
     cus1.nama_customer="Pratiwi Ashari";
     cus1.setAlamat("Jalan gunung salak");
     cus1.jenis_kelamin=JenisKelamin.PEREMPUAN;
     
     Customer cus2 = new Customer();
     cus2.nama_customer="Adi Wira";
     cus2.setAlamat("Jalan nangka");
     cus2.jenis_kelamin=JenisKelamin.LAKI_LAKI;
     
     Pegawai pgw = new Pegawai();
     pgw.tambahCus(cus1);
     pgw.tambahCus(cus2);
     pgw.hapusCus(cus1);
     
     System.out.println("Masukkan nama customer : ");
     String caricus=input.nextLine();
     
     System.out.println(pgw.cariCostumer(caricus));
     */
     /*
     new OptionPane();
     */
     
     /*
     //Cari Pegawai
     Pegawai peg1 = new Pegawai ();
     peg1.nama_pegawai = "Sintia";
     peg1.alamat ="Jalan Cokrominoto";
     peg1.jenis_kelamin=JenisKelamin.PEREMPUAN;
     
     Showroom shw = new Showroom();
     shw.tambahPeg(peg1);
     
     System.out.println ("Masukkan nama Pegawai : ");
     String caripeg=input.nextLine();
     
     System.out.println(shw.cariPegawai(caripeg));
     */
    
    
     /*
     //validasi
     Pegawai peg1 = new Pegawai ();
     peg1.val=Validasi.LUNAS;
     peg1.memvalidasi();
     
     
     Mobil mbl1 = new Mobil ();
     mbl1.jenis_mobil=JenisMobil.MATIC;
     mbl1.HargaMobil();
     */
     
     Customer cus3 = new Customer();
     cus3.nama_customer="Toby";
     cus3.setId_customer(1001);
     cus3.setAlamat("nusa dua");
     cus3.setNo_tlp(7896543);
     cus3.jenis_kelamin=JenisKelamin.LAKI_LAKI;
     cus3.nota=Validasi.LUNAS;
     cus3.cetakNota();
     
     Mobil mbl1 = new Mobil();
     mbl1.nama_mobil="BMW";
     mbl1.harga=1000000000;
     mbl1.jenis_mobil=JenisMobil.MATIC;
     mbl1.warna="Hitam";
     mbl1.HargaMobil();
    }
     
}
    
