/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi13042023;

/**
 *
 * @author LEGION Y540
 */
public class MyInteger implements Relation {
    
    public boolean isGreater( Object a, Object b){  //object itu superclass bisa jadi tipe data apa saja (int,boolean,dll)
        return((int) a > (int) b); //merubah object menjadi tipedata int
    }
    public boolean isLess( Object a, Object b){
        return((int) a < (int) b);
    } 
    public boolean isEqual( Object a, Object b){
        return((int) a == (int) b);
    }
    
}
