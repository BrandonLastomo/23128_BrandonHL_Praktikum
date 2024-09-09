/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.Latihan10;

import Pertemuan2.Latihan8.*;

/**
 *
 * @author brand
 */
public class MatematikaCanggih extends Matematika {
    String NIM, nama;
    
    public MatematikaCanggih(String NIM, String nama){
        this.NIM = NIM;
        this.nama = nama;
    }
    
    public void tambah(double a, double b, double c){
        System.out.println("Hasil pertambahan dari " + a + "+" + b + "+" + c +" adalah " + (a+b+c) + " by: " + NIM + ", " + nama);
    }
    
    public void kurang(double a, double b, double c){
        System.out.println("Hasil pengurangan dari " + a + "-" + b + "-" + c +" adalah " + (a-b-c) + " by: " + NIM + ", " + nama);
    }
}
