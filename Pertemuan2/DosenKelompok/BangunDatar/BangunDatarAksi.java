/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RAKA
 */
public class BangunDatarAksi {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());

        Segitiga segitiga = new Segitiga(3, 4, 5);
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());

        PersegiEmpat persegiEmpat = new PersegiEmpat(4);
        System.out.println("Keliling Persegi Empat: " + persegiEmpat.hitungKeliling());
        System.out.println("Luas Persegi Empat: " + persegiEmpat.hitungLuas());
    }
}