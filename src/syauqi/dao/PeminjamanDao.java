/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi.dao;

import java.util.List;
import syauqi.model.Peminjaman;
/**
 *
 * @author LEGION Y540
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws Exception;
    void update(Peminjaman peminjaman) throws Exception;
    void delete(Peminjaman peminjaman) throws Exception;
    Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}

//exception = superclass, lebih menyeluruh saat menangkap error
//sqlexception = subclass dari exception, lebih spesifik ketika menangkap error sql
// pada peminjamanDao bisa dibikin exception dan daoImpl bisa dibikin sqlexception karena sqlexception subclass