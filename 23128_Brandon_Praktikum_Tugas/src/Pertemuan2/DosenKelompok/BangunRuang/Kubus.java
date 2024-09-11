/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author RAKA
 */
class Kubus {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}