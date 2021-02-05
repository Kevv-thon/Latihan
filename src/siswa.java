/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class siswa {
    String nama;
    int nilai;
    
    void cetaknilai() {
        System.out.println("Nilai Produktif X RPL 5 "+nama+" adalah =" +nilai);
    }
    public boolean lulus(){
        return nilai>=75;
    }
    public boolean tidaklulus(){
        return nilai<74;
    }
}
