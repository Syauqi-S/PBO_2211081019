/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi.controller;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import syauqi.view.FormPengembalian;
import syauqi.model.*;
import syauqi.dao.*;
import syauqi.db.DbHelper;
/**
 *
 * @author LEGION Y540
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    Pengembalian pengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    BukuDao bukuDao;
    AnggotaDao anggotaDao;

    public PengembalianController(FormPengembalian formPengembalian){
        try {
            this.formPengembalian = formPengembalian;
            pengembalian = new Pengembalian();
            pengembalianDao = new PengembalianDaoImpl(DbHelper.getConnection());
            peminjamanDao = new PeminjamanDaoImpl(DbHelper.getConnection());
            bukuDao = new BukuDaoImpl(DbHelper.getConnection());
            anggotaDao = new AnggotaDaoImpl(DbHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void clearForm(){
        formPengembalian.getTxtTglPinjam().setText("");
        formPengembalian.getTxtTgldiKembalikan().setText("");
    }
    
    public void isiComboAnggota(){
        try {
            formPengembalian.getCboKodeAnggota().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for(Anggota anggota : list){
                formPengembalian.getCboKodeAnggota()
                        .addItem(anggota.getKodeanggota() + " - " + anggota.getNamaanggota());
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void isiComboBuku(){
        try {
            formPengembalian.getCboKodeBuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for(Buku buku : list){
                formPengembalian.getCboKodeBuku()
                        .addItem(buku.getKodebuku()+ " - " + buku.getJudulbuku());
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
