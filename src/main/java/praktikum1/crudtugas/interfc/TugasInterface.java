/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikum1.crudtugas.interfc;

import java.sql.SQLException;
import java.util.List;
import praktikum1.crudtugas.models.Tugas;

/**
 *
 * @author ASUS
 */
public interface TugasInterface {
    Tugas add (Tugas o) throws SQLException;
    
    void update (Tugas o) throws SQLException;
    
    void delete (int ID) throws SQLException;
    
    List<Tugas> getAll() throws SQLException;
    
}
