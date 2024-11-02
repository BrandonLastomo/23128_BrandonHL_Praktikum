/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;
import java.util.Scanner;
/**
 *
 * @author brand
 */
public class tugasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        int jumlahBayar;
        int totalBayar = 0;
        
        System.out.println("Toko Serba Ada\n**************");
        System.out.print("Masukkan Item Barang: ");
        jumlah = input.nextInt();
        
        String[][] dbBarang = {
            {"a001", "Buku", "3000"},
            {"a002", "Pensil", "4000"},
            {"a003", "Pulpen", "5000"}
        };
        String[][] barangDibeli = new String[jumlah][5];
        
        int i = 0;
        while(i < jumlah){
            System.out.print("Data ke-" + (i+1) + "\n");
            String kodeBarang;
            do {
                System.out.print("Masukkan kode\t\t: ");
                kodeBarang = input.next();
                if (!isKodeValid(dbBarang, kodeBarang)) {
                    System.out.println("Kode tidak ditemukan, coba lagi.");
                }
            } while (!isKodeValid(dbBarang, kodeBarang));
            
            barangDibeli[i][0] = kodeBarang;
            for(int x = 0; x < dbBarang.length; x++){
                if(barangDibeli[i][0].equals(dbBarang[x][0])){
                    barangDibeli[i][2] = dbBarang[x][1];
                    barangDibeli[i][3] = dbBarang[x][2];
                }
            }

            System.out.print("Masukkan jumlah beli\t: ");
            barangDibeli[i][1] = input.next();
            
            jumlahBayar = Integer.parseInt(barangDibeli[i][1]) * Integer.parseInt(barangDibeli[i][3]);
            totalBayar += jumlahBayar;
            barangDibeli[i][4] = String.valueOf(jumlahBayar);
            i++;
        }
        
        System.out.println("\n\nToko Serba Ada\n**************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===============================================================================");

        for(int a = 0; a < jumlah; a++){
            System.out.println((a+1) + "\t" + barangDibeli[a][0] + "\t\t" + barangDibeli[a][2] + "\t\t" + barangDibeli[a][3] + "\t" + barangDibeli[a][1] + "\t\t" + barangDibeli[a][4]);
        }
        System.out.println("===============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
    }
    
    public static boolean isKodeValid(String[][] dbBarang, String kode) {
        for (String[] barang : dbBarang) {
            if (barang[0].equals(kode)) {
                return true;
            }
        }
        return false;
    }
}