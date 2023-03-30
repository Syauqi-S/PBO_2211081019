/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi30032023;

/**
 *
 * @author LEGION Y540
 */
public class Aritmatika {
    //method harus menghasilkan return
    public int tambah(int a, int b){
        return a + b;
    }
    
    public boolean cekGanjil(int a){
        return (a%2!=0);
    }
    
    public int[] ganjil(int a){
        int[] ar = new int[a];
        int j = 0;
        for(int i = 0; i < 2*a; i++){
            if(cekGanjil(i)){
                ar[j] = i;
                j++;
            }
        }
        return ar;
    }
}
    
    
 
