/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import java.io.*; //mengimport semua class di package io
/**
 *
 * @author LEGION Y540
 */
public class Latihan651Buff {
    public static void main(String[] args){
    
        BufferedReader Inputusr = new BufferedReader(new InputStreamReader(System.in));
        int tgs1, tgs2, tgs3, avg; //deklarasi var nilai tugas dan rata-rata 
        
        try{ //input nilai tugas
            //input nilai tugas ke 1
            //menambahkan while agar user menginputkan nilai sesuai range 0-100
            System.out.print("Masukkan nilai tgs1 = ");
            tgs1 = Integer.parseInt(Inputusr.readLine());
            while(tgs1 < 0 || tgs1 > 100){ //kondisi user jika input di luar range
                System.out.print("Range nilai 0-100! Masukkan nilai ulang = ");
                tgs1 = Integer.parseInt(Inputusr.readLine());
            }
            //input nilai tugas ke 2
            System.out.print("Masukkan nilai tgs2 = ");
            tgs2 = Integer.parseInt(Inputusr.readLine());
            while(tgs2 < 0 || tgs2 > 100){
                System.out.print("Range nilai 0-100! Masukkan nilai ulang = ");
                tgs2 = Integer.parseInt(Inputusr.readLine());
            }
            //input nilai tugas ke 3
            System.out.print("Masukkan nilai tgs3 = ");
            tgs3 = Integer.parseInt(Inputusr.readLine());
            while(tgs3 < 0 || tgs3 > 100){
                System.out.print("Range nilai 0-100! Masukkan nilai ulang = ");
                tgs3 = Integer.parseInt(Inputusr.readLine());
            }
            
            avg = (tgs1 + tgs2 + tgs3) / 3; //proses mencari rata-rata
            
            if(avg >= 60 && avg <= 100){ //range nilai diatas rata-rata (60-100)
                System.out.println("rata-rata nilai = " + avg);
                System.out.println("Selamat nilai anda diatas rata-rata :)");
            }
            else if( avg < 0 || avg > 100){ // kondisi ketika user memasukkan angka diluar dari range (0-100)
                System.out.println("Tolong Masukkan nilai dari 0 - 100 saja >:(");
            }
            else{ //range nilai dibawah rata-rata (0-59)
                System.out.println("rata-rata nilai = " + avg);
                System.out.println("Nilai anda dibawah rata-rata :(");
            }
        }catch( IOException e ){
        }
    }
}
