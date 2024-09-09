/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.Latihan6;

/**
 *
 * @author brand
 */
public class KalidanBagi2 {

    public static void perkalian(int a){
        System.out.println("Hasil dari " + a + " dikali 2 adalah " + (a << 1));
    }
    public static void pembagian(int a){
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
