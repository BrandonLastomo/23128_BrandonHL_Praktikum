/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan2;

/**
 *
 * @author brand
 */
public class MatematikaCanggihBangetBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari class MatematikaCanggihBanget
        MatematikaCanggihBanget operasiMatematika = new MatematikaCanggihBanget();
        
        // Memanggil method
        operasiMatematika.tambah(1, 2);
        operasiMatematika.kali(10, 15);
        operasiMatematika.modulus(5, 2);
        operasiMatematika.pertambahanTiga(5, 2, 3);
    }
    
}
