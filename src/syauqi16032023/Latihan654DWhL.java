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
public class Latihan654DWhL {
    public static void main(String[] args){
    
        int n, pkt; //deklarasi n dan pkt
        int hsl = 1; //deklarasi hsl dan berisi nilai 1
        
        //input user nilai dan pangkat 
        n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
        pkt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat"));
        
        int i = 1; //deklarasi i diisi nilai 1
        //melakukan perulangan selama i lebih kecil atau sama dengan pkt
        do{
            hsl = hsl * n; //proses pemangkatan
            i++; //nilai i bertambah +1 agar perulangan bisa memenuhi kondisi i <= pkt
        }while(i <= pkt); //jika terpenuhi perulangan berhenti
        
        JOptionPane.showMessageDialog(null, "Nilai " + n + " Pangkat " + pkt + " = " + hsl); //output
    }
}
