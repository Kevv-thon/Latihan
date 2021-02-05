/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        siswa pelajar = new siswa();
        pelajar.nama = "Anya";
        pelajar.nilai = 80;
        
        pelajar.cetaknilai();
        if (pelajar.lulus()) {
            System.out.println("selamat anda lulus");
        }
        else if (pelajar.tidaklulus()) {
            System.out.println("Anda harus belajar lebih giat lagi");
        }
    }
    
}
