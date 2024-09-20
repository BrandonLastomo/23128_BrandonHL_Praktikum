/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RAKA
 */
class PersegiPanjang {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    double hitungLuas() {
        return panjang * lebar;
    }
}