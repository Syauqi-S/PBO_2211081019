/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi18032023;

/**
 *
 * @author LEGION Y540
 */
public class Latihan773BukuAlamat {
    public static void main(String[] args){
    
        String[][] entry = {{"Florence","735-1234","Manila"}, //deklarasi dan mengisi index
            {"Joyce","983-333","Quezon City"},
            {"Becca","456-3322","Manila"}};
        
        for(int i = 0; i < entry.length; i++){
            System.out.println("Name  : " + entry[i][0]); //mengakses baris index ke i dengan nilai 0 yaitu nama(kolom 1)
            System.out.println("Tel. #  : " + entry[i][1]); // mengakses baris index ke i dengan nilai 1 yaitu tel(kolom 2)
            System.out.println("Address : " + entry[i][2]); //mengakses baris index ke i dengan nilai 2 yaitu address(kolom 3)
        }
    }
}
