/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi15042023.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LEGION Y540
 */
public class BukuDaoImpl implements BukuDao {
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("8295","Hello","Stall","man","2004"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
