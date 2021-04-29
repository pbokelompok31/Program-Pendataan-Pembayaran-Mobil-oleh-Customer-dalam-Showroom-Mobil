/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom_mobil;
import javax.swing.*;

/**
 *
 * @author THIS-PC
 */
public class OptionPane {
    JFrame f;
    OptionPane (){
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Selamat Datang di Showroom Kami.");
        JOptionPane.showInputDialog(f,"Masukan nama anda");
        
    }
}
