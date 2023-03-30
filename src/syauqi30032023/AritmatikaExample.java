/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi30032023;

/**
 *
 * @author LEGION Y540
 */
public class AritmatikaExample {
    public static void main(String[] args){
    
        Aritmatika ar = new Aritmatika(); //Aritmatika = class, aritmatika = object
        
        int tbh = ar.tambah(12, 13);
        System.out.println(tbh);
        
        Boolean cek = ar.cekGanjil(13);
        System.out.println("cek Ganjil: " + cek);
        
        int[] ls = ar.ganjil(5);
            for(int i = 0; i < ls.length; i++){
                System.out.print(ls[i] + " ");
            }
            System.out.println();
        ls = ar.prima(5);
            for(int i = 0; i < ls.length; i++){
                System.out.print(ls[i] + " ");
            }
            System.out.println();
    }
}
