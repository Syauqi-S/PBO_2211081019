/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi18032023;

import java.io.*;
/**
 *
 * @author LEGION Y540
 */
public class Latihan772Buff {
    public static void main(String[] args){
    
        BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));
        int[] nomor = new int[10];
        int i;
        try{
        for(i = 0; i < 10; i++){
            System.out.print("Masukkan Nilai Index ke " + (i+1) + " : ");
            nomor[i] = Integer.parseInt(inu.readLine());
        }
        
        int idx = 0;
        int highest = nomor[0];
        for(i = 0; i < 10; i++){
            if(nomor[i] > highest){
                highest = nomor[i];
                idx = i;
            }
        }
        System.out.println("Nilai tertinggi " + highest + " pada index " + ++idx);
        }catch( IOException e ){
        }
    }
}
