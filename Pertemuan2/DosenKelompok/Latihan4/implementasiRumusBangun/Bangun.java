/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan4.implementasiRumusBangun;
import Pertemuan2.DosenKelompok.Latihan4.rumusBangun.*;
/**
 *
 * @author brand
 */
public class Bangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar kalkulatorBangunDatar = new BangunDatar();
        BangunRuang kalkulatorBangunRuang = new BangunRuang();
        
        // bangun datar
        // persegi panjang
        System.out.println("===Bangun Datar===\n");
        System.out.println("=====Persegi Panjang=====");
        System.out.println("Keliling dari persegi panjang dengan panjang 5 dan lebar 3 adalah: "
                            + kalkulatorBangunDatar.kelilingPersegiPanjang(5, 3));
        System.out.println("Luas dari persegi panjang dengan panjang 5 dan lebar 3 adalah: "
                            + kalkulatorBangunDatar.luasPersegiPanjang(5, 3));
        System.out.println("==============================\n");
        
        // segitiga
        System.out.println("=====Segitiga=====");
        System.out.println("Keliling dari segitiga dengan panjang sisi 2, 3, dan 5 adalah: "
                            + kalkulatorBangunDatar.kelilingSegitiga(2, 3, 5));
        System.out.println("Luas dari segitiga dengan panjang alas 7 dan tinggi 4 adalah: "
                            + kalkulatorBangunDatar.luasSegitiga(7, 4));
        System.out.println("==============================\n");
        
        // lingkaran
        System.out.println("=====Lingkaran=====");
        System.out.println("Keliling dari lingkaran dengan panjang jari-jari 14 adalah: "
                            + kalkulatorBangunDatar.kelilingLingkaran(14));
        System.out.println("Luas dari lingkaran dengan panjang jari-jari 14 adalah: "
                            + kalkulatorBangunDatar.luasLingkaran(14));
        System.out.println("==============================\n");
        
        // persegi
        System.out.println("=====Persegi=====");
        System.out.println("Keliling dari persegi dengan panjang sisi 3.14 adalah: "
                            + kalkulatorBangunDatar.kelilingPersegi(3.14));
        System.out.println("Luas dari lingkaran dengan panjang jari-jari 14 adalah: "
                            + kalkulatorBangunDatar.luasPersegi(3.14));
        System.out.println("==============================\n\n");
        
        // bangun ruang
        // balok
        System.out.println("===Bangun Ruang===\n");
        System.out.println("=====Balok=====");
        System.out.println("Luas permukaan dari balok dengan panjang 5, lebar 3, dan tinggi 15 adalah: "
                            + kalkulatorBangunRuang.luasPermukaanBalok(5, 3, 15));
        System.out.println("Volume dari balok dengan panjang 5, lebar 3, dan tinggi 15 adalah: "
                            + kalkulatorBangunRuang.volumeBalok(5, 3, 15));
        System.out.println("==============================\n");
        
        // prisma segitiga
        System.out.println("=====Prisma Segitiga=====");
        System.out.println("Luas permukaan dari prisma segitiga dengan panjang alas segitiga 5, "
                            + "tinggi segitiga 12, sisi miring segitiga 13, dan tinggi prisma 5 adalah: "
                            + kalkulatorBangunRuang.luasPermukaanPrismaSegitiga(5, 12, 13, 5));
        System.out.println("volume dari prisma segitiga dengan panjang alas segitiga 7, tinggi segitiga 12,"
                            + " dan tinggi prisma 5 adalah: "
                            + kalkulatorBangunRuang.volumePrismaSegitiga(7, 12, 5));
        System.out.println("==============================\n");
        
        // tabung
        System.out.println("=====Tabung=====");
        System.out.println("Luas permukaan dari tabung dengan panjang jari-jari 14 dan tinggi tabung 7 adalah: "
                            + kalkulatorBangunRuang.luasPermukaanTabung(14, 7));
        System.out.println("Luas dari lingkaran dengan panjang jari-jari 14 dan tinggi tabung 7 adalah: "
                            + kalkulatorBangunRuang.volumeTabung(14, 7));
        System.out.println("==============================\n");
        
        // kubus
        System.out.println("=====Kubus=====");
        System.out.println("Luas permukaan dari kabus dengan panjang sisi-sisinya adalah 5 adalah: "
                            + kalkulatorBangunRuang.luasPermukaanKubus(5));
        System.out.println("Luas dari kabus dengan panjang sisi-sisinya adalah 5 adalah: "
                            + kalkulatorBangunRuang.volumeKubus(5));
        System.out.println("==============================\n");
        
    }
    
}
