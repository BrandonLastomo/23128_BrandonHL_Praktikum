/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1.Latihan2;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        float nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
        
        nilaiMahasiswa.NIM = "xxxxx";
        nilaiMahasiswa.nama = "xxxxx";
        System.out.print("input absen: ");
        nilaiAbsen = input.nextFloat();
        System.out.print("input tugas: ");
        nilaiTugas = input.nextFloat();
        System.out.print("input UTS: ");
        nilaiUTS = input.nextFloat();
        System.out.print("input UAS: ");
        nilaiUAS = input.nextFloat();
        
        nilaiMahasiswa.Nilai(nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS);
        nilaiMahasiswa.cetakNilai();
    }
    
}
