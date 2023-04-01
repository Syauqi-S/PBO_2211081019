/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi01042023;

/**
 *
 * @author LEGION Y540
 */
public class StudentRecordExample {
    public static void main(String[] args){
    
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(19);
        
        cris.setName("Cris");
        cris.setAddress("BukitTinggi");
        cris.setAge(20);
        
        //output
        System.out.println("Data object anna ");
        System.out.println("Nama    : " + anna.getName()); //tidak static manggil lewat object(getname tidak static)
        System.out.println("Address : " + anna.getAddress());
        System.out.println("Age     : " + anna.getAge());
        
        
        System.out.println("\nData object cris");
        cris.print("");
        cris.print(70, 80, 90);
        
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("Count = " + StudentRecord.getStudentCount()); //static(milik class) jadi tidak perlu membuat object lagi utk memanggil
        
    }
}
