/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.latihan3;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class PenentuKriteriaKegemukan {
    
    // IMT = Indeks Massa Tubuh
    // Method untuk menampilkan kriteria berdasarkan IMT
    public static void printKriteria(float IMT){
        System.out.println("Indeks Massa Tubuh (IMT) Anda sebesar " + IMT);
        // menentukan kriteria berdasarkan IMT
        if(IMT > 40){
            System.out.println("Sangat Gemuk");
        } else if(IMT >= 30){
            System.out.println("Gemuk");
        } else if(IMT >= 25){
            System.out.println("Berat Badan Lebih");
        } else if(IMT >= 18.5){
            System.out.println("Berat Badan Ideal");
        } else if(IMT > 0){
            System.out.println("Berat Badan Kurang");
        } else {
            System.out.println("IMT invalid. Harap hitung ulang.");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instansiasi objek untuk ambil input dari user
        Scanner input = new Scanner(System.in);
        float beratBadan, tinggiBadan, IMT;
        
        System.out.print("Masukkan Berat Badan (Kg): ");
        // mengambil input berat badan dari user
        beratBadan = input.nextFloat();
        System.out.print("Masukkan Tinggi Badan (m): ");
        // mengambil input tinggi badan dari user
        tinggiBadan = input.nextFloat();
        // hitung IMT
        IMT = beratBadan/(tinggiBadan*tinggiBadan);
        
        // memanggil method menampilkan kriteria berdasarkan IMT
        printKriteria(IMT);
    }
    
}
