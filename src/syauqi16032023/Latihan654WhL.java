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
public class Latihan654WhL {
    public static void main(String[] args){
    
        int n, pkt; //deklarasi n dan pkt
        int hsl = 1; //deklarasi hsl diisi 1
        
        //input nilai dan pangkat dari user
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
        pkt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pangkat"));
        
        int i = 1;
        while(i <= pkt){ // jika nilai i sudah sama dengan pkt, perulangan berhenti
            hsl = hsl * n; //proses pemangkatan
            i++; //nilai i bertambah +1 setiap perulangan
        }
        JOptionPane.showMessageDialog(null,"Nilai " + n + " Pangkat " + pkt + " = " + hsl); //output
    }
}
