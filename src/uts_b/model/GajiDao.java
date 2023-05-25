/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uts_b.model;

/**
 *
 * @author LEGION Y540
 */
import java.util.List;

public interface GajiDao {
    
    void save(Gaji gaji);
    void update(int index, Gaji gaji);
    void delete(int index);
    Gaji getGaji(int index);
    List<Gaji> getAll();
}
