/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi.dao;

import syauqi.model.Anggota;
import java.util.List;
/**
 *
 * @author LEGION Y540
 */
//untuk deklarasi aja
public interface AnggotaDao {
    void insert (Anggota anggota) throws Exception; //kerjanya akan di letak di daoImpl
    void update (Anggota anggota) throws Exception;
    void delete (Anggota anggota) throws Exception;
    Anggota getAnggota (String kodeanggota) throws Exception;
    List<Anggota> getAll() throws Exception;
}
