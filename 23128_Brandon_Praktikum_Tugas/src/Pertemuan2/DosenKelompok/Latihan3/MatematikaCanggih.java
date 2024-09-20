/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan3;

/**
 *
 * @author brand
 */
// melakukan pewarisan method dari class Matematika ke MatematikaCanggih menggunakan extends
public class MatematikaCanggih extends Matematika {
    String NIM, nama;
    
    // method constructor untuk MatematikaCanggih agar dapat langsung mengisi NIM dan nama ketika membuat objek
    public MatematikaCanggih(String NIM, String nama){
        this.NIM = NIM;
        this.nama = nama;
    }
    
    // overloading method tambah agar bisa melakukan pertambahan dengan 3 nilai
    public void tambah(double a, double b, double c){
        System.out.println("Hasil pertambahan dari " + a + "+" + b + "+" + c +" adalah " + (a+b+c) + " by: " + NIM + ", " + nama);
    }
    
    // overloading method kurang agar bisa melakukan pengurangan dengan 3 nilai
    public void kurang(double a, double b, double c){
        System.out.println("Hasil pengurangan dari " + a + "-" + b + "-" + c +" adalah " + (a-b-c) + " by: " + NIM + ", " + nama);
    }
}
