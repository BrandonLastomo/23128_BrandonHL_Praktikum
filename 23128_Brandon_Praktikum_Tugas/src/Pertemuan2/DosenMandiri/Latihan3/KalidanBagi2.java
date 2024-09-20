/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.DosenMandiri.Latihan3;

/**
 *
 * @author brand
 */
public class KalidanBagi2 {

    public static void perkalian(int a){
        // mengalikan dengan 2 menggunakan operator bitwise << 1 karena operator << 1 berarti menggeser 1 bit ke kiri yang sama dengan mengalikan dengan 2
        System.out.println("Hasil dari " + a + " dikali 2 adalah " + (a << 1));
    }
    public static void pembagian(int a){
        // membagi dengan 2 menggunakan operator bitwise >> 1 karena operator >> 1 berarti menggeser 1 bit ke kanan yang sama dengan membagi dengan 2
        System.out.println("Hasil dari " + a + " dibagi 2 adalah " + (a >> 1));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perkalian(2);
        pembagian(2);
        perkalian(5);
        pembagian(7);
    }
    
}
