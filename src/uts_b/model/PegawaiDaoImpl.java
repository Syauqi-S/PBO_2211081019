/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_b.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LEGION Y540
 */
public class PegawaiDaoImpl implements PegawaiDao{
    List<Pegawai> data = new ArrayList<>();
    
    public PegawaiDaoImpl(){ //constructor inisialisasi data
        data.add(new Pegawai("1001","Rahmat","Bali"));
        data.add(new Pegawai("1002","Rani","Jakarta"));
        data.add(new Pegawai("1003","Beni","Pekanbaru"));
    }
    
    public void save(Pegawai pegawai){
        data.add(pegawai);
    }
    public void update(int index, Pegawai pegawai){
        data.set(index, pegawai);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pegawai getPegawai(int index){
        return data.get(index);
    }
    public List<Pegawai> getAll(){
        return data;
    }
}
