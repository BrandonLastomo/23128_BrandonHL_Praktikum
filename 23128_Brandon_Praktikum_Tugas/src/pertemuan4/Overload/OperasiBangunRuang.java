/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4.Overload;

/**
 *
 * @author brand
 */
public class OperasiBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek dari class RumusBangunRuang
        RumusBangunRuang rumus = new RumusBangunRuang();
        // inisiasi ukuran bangun ruang
        double s = 2.5;
        double p = 3.75;
        double l = 8.52;
        double t = 9.11;
        
        // kubus
        System.out.println("=====Luas Permukaan dan Volume Kubus=====");
        // menampilkan luas permukaan kubus
        System.out.println("Luas permukaan dari kubus dengan sisi " + s + "cm adalah: " + rumus.luas(s) + " cm");
        // menampilkan volume kubus
        System.out.println("Volume dari kubus dengan sisi " + s + "cm adalah: " + rumus.volume(s) + " cm");
        System.out.println("==============================");
        
        // balok
        System.out.println("\n=====Luas Permukaan dan Volume Balok=====");
        // menampilkan luas permukaan balok
        System.out.println("Luas permukaan dari balok dengan panjang " + p + " cm, lebar " + l + "cm, tinggi " + t + " cm " + "adalah: " + rumus.luas(p, l, t) + " cm");
        // menampilkan volume balok
        System.out.println("Volume dari balok dengan panjang " + p + " cm, lebar " + l + "cm, tinggi " + t + " cm " + "adalah: " + rumus.volume(p, l, t) + " cm");
        System.out.println("==============================");
    }
    
}
