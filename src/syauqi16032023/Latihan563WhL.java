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
public class Latihan563WhL {
    public static void main(String[] args){
    
    String nama; //deklarasi nama
    int n = 1; //deklarasi n dan diisi 1
    
    nama = JOptionPane.showInputDialog(null, "Masukkan nama anda"); //input nama
        while(true){
            System.out.println(nama +" ke "+ n);
            if(n <= 100){ // nilai n akan bertambah sampai 100
                n++; //nilai n bertambah
                if(n == 101){ //jika sudah lebih dari 100, keluar dari looping
                    break; //keluar dari loop
                }
            }
        }
    }
}
