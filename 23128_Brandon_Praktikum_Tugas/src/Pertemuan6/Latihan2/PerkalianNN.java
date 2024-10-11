/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6.Latihan2;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class PerkalianNN {

    // method untuk menampilkan tabel perkalian
    public static void tabelPerkalian(int batas){
        for(int i = 0; i <= batas; i++){
            // menampilkan baris head (baris di paling atas hasil perkalian)
            if(i == 0){
                System.out.print("   ");
                for (int k = 1; k <= batas; k++){
                    System.out.print(k + " ");
                }
                System.out.println();
            // menampilkan kolom head (kolom di paling kiri sebelum hasil perkalian) dan hasil perkalian
            } else {
                // menampilkan kolom head
                System.out.print(i + "  ");
                // menampilkan hasil perkalian
                for (int j = 1; j <= batas; j++){
                    System.out.print(j*i + " ");
                }
                System.out.println();
            }   
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // meminta batasan perkalian dari user
        System.out.print("Masukkan batas perkalian (maksimal hingga 10): ");
        int batasKali = input.nextInt();
        
        // menampilkan hasil perkalian berdasarkan input user
        tabelPerkalian(batasKali);
        
    }
    
}
