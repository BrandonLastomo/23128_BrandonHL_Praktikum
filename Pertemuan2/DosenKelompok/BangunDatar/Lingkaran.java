/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RAKA
 */
class Lingkaran {
    double radius;

    Lingkaran(double radius) {
        this.radius = radius;
    }

    double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    double hitungLuas() {
        return Math.PI * radius * radius;
    }
}