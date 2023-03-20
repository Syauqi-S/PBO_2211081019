/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import javax.swing.JOptionPane;
/**
 *
 * @author LEGION Y540
 */
public class Latihan654FL {
    public static void main(String[] args){
    
        int n, pkt; //
        int hsl = 1; //deklarasi hasil
        
        //input nilai dan pangkat
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
        pkt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat"));
        
        for(int i = 1; i <= pkt; i++){ //melakukan pengulangan sebanyak pangkat
            hsl = hsl * n; // mengkalikan hasil dengan nilai yang diinput
        }
        JOptionPane.showMessageDialog(null, "Nilai "+ n + " Pangkat " + pkt + " = " + hsl); //menampilkan inputan user dan hasil dari pangkat 
    }
}
