/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi18032023;

import javax.swing.JOptionPane;
/**
 *
 * @author LEGION Y540
 */
public class Latihan772JOP {
    public static void main(String[] args){
    
        int[] nomor = new int[10]; //deklarasi array dengan panjang 10
        int i; //deklarasi i
        for(i = 0; i < 10; i++){ //looping 0-9
            nomor[i] = Integer.parseInt(JOptionPane.showInputDialog("Isi array ke " + (i+1))); //mengisi index
        }
        int idx = 0; //deklarasi idx untuk output index tertinggi
        int highest = nomor[0]; //deklarasi highest dengan index nilai terkecil
        for(i = 0; i < 10; i++){ //looping 0-9
            if(nomor[i] > highest){ //jika nilai index lebih besar dari nilai sebelumnya
                highest = nomor[i]; // meletak nilai index terbesar
                idx = i; //meletak index terbesar
            }
        }
        JOptionPane.showMessageDialog(null, "Nilai terbesar : " + highest + " Index ke : " + ++idx); //output nilai index terbesar dan index yang memiliki nilai tsb
    }
}
