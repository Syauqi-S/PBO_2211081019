/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package syauqi.dao;

import java.util.List;
import syauqi.model.Buku;
/**
 *
 * @author LEGION Y540
 */
public interface BukuDao {
    
    void insert (Buku buku) throws Exception; //kerjanya akan di letak di daoImpl
    void update (Buku buku) throws Exception;
    void delete (Buku buku) throws Exception;
    Buku getBuku (String kodebuku) throws Exception;
    List<Buku> getAll() throws Exception;
}
