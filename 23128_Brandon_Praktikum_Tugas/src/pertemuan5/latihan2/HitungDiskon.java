/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.latihan2;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class HitungDiskon {
    
    // method untuk memperlihatkan data terkait diskon
    public static void printDiskon(double total){
        double diskon;
        if(total >= 50000){
            // jika total belanja >= Rp50.000, pelanggan mendapatkan diskon 20%
            diskon = 0.2;
            // menampilkan data-data terkait diskon yang didapatkan
            System.out.println("Total pembelian = Rp" + total);
            System.out.println("Besarnya potongan = Rp" + (total*diskon));
            System.out.println("Jumlah yang Harus Dibayarkan = Rp" + (total-(total*diskon)));
        } else if(total < 50000){
            // jika total belanja < Rp50.000, pelanggan mendapatkan diskon 5%
            diskon = 0.05;
            // menampilkan data-data terkait diskon yang didapatkan
            System.out.println("Total pembelian = Rp" + total);
            System.out.println("Besarnya potongan = Rp" + (total*diskon));
            System.out.println("Jumlah yang Harus Dibayarkan = Rp" + (total-(total*diskon)));
        } else {
            System.out.println("Total belanja invalid.");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instansiasi objek untuk ambil input dari user
        Scanner input = new Scanner(System.in);
        double totalBelanja;
        
        System.out.print("Masukkan total belanja: Rp");
        // mengambil input total belanja dari user
        totalBelanja = input.nextDouble();
        // memanggil method untuk menghitung diskon yang didapat
        // dan menampilkan data tentang diskon
        printDiskon(totalBelanja);
    }
    
}
