/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import javax.swing.JOptionPane; //import class JOptionPane dari package swing
/**
 *
 * @author LEGION Y540
 */
public class Latihan652if {
    public static void main(String[] args){
    
        int inu; //deklarasi inu
        
        //input nilai
        inu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 1-10 "));
        if(inu >= 1 && inu <= 10){ //kondisi jika input range 1-10
            JOptionPane.showMessageDialog(null, "Nilai yang diinputkan : " + inu);
        }else{ // kondisi jika input diluar 1-10
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }
    }
}
