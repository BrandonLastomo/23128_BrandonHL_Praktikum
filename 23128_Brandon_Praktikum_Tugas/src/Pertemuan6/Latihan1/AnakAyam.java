/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6.Latihan1;

/**
 *
 * @author brand
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Tek kotek, kotek kotek\nAnak ayam turunlah berkotek");
        System.out.println("Tek kotek, kotek kotek\nAnak ayam turunlah berkotek");
        // pengulangan untuk mengurangi anak ayam
        for(int i = 4; i > 0; i--){
            System.out.println("Anak ayam turunlah " + i);
            // jika anak ayam tidak bersisa (anak ayam bersisa satu (i == 1) dan turun), tampilkan "tinggal induk"
            if(i == 1){
                System.out.println("Mati satu tinggallah induknya");
            // Selain itu, tampilkan jumlah anak ayam
            } else {
                System.out.println("Mati satu tinggallah " + (i-1));
            }
        }
    }
    
}
