/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1.Latihan2;

/**
 *
 * @author brand
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilaiMahasiswa = new Nilai();
        
        nilaiMahasiswa.NIM = "xxxxx";
        nilaiMahasiswa.nama = "xxxxx";
        
        nilaiMahasiswa.Nilai(0, 0, 0, 0);
        nilaiMahasiswa.cetakNilai();
    }
    
}
