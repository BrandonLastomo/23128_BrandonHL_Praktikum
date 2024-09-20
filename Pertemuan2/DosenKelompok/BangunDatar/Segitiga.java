/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author RAKA
 */
class Segitiga {
    double alas;
    double tinggi;
    double sisiMiring;

    Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}