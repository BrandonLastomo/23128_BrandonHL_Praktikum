/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RAKA
 */
class PersegiEmpat {
    double sisi;

    PersegiEmpat(double sisi) {
        this.sisi = sisi;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }
}