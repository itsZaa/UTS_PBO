package controller;

import java.util.ArrayList;
import model.Nasabah;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ControllerPeminjaman {
    private  ArrayList<Nasabah>listNasabah = new ArrayList();
    
    public ControllerPeminjaman (ArrayList<Nasabah>listNasabah) {
        this.listNasabah = listNasabah;
    }
    
}
