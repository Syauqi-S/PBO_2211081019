/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi13042023;

/**
 *
 * @author LEGION Y540
 */
public class MyDouble implements Relation {
    
    public boolean isGreater( Object a, Object b){  //object itu superclass bisa jadi tipe data apa saja (int,boolean,dll)
        return((double) a > (double) b); //merubah object menjadi tipedata double
    }
    public boolean isLess( Object a, Object b){
        return((double) a < (double) b);
    } 
    public boolean isEqual( Object a, Object b){
        return((double) a == (double) b);
    }
}
