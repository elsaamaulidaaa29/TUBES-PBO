/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.crudtugas.models;

/**
 *
 * @author ASUS
 */
public class Tugas {
    private String ID;
    private String namaTugas;
    private String deskripsiTugas;
    private String tenggatWaktu;

    public String getID() {
        return ID;
    }

    public Tugas(String ID, String namaTugas, String deskripsiTugas, String tenggatWaktu) {
        this.ID = ID;
        this.namaTugas = namaTugas;
        this.deskripsiTugas = deskripsiTugas;
        this.tenggatWaktu = tenggatWaktu;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public void setDeskripsiTugas(String deskripsiTugas) {
        this.deskripsiTugas = deskripsiTugas;
    }

    public void setTenggatWaktu(String tenggatWaktu) {
        this.tenggatWaktu = tenggatWaktu;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeskripsiTugas() {
        return deskripsiTugas;
    }

    public String getTenggatWaktu() {
        return tenggatWaktu;
    }
    
}
