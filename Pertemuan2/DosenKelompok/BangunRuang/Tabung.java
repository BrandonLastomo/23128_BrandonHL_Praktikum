/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author RAKA
 */
class Tabung {
    double radius;
    double tinggi;

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}
