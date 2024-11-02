/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author brand
 */
public class HitungHari {
    int jumlahHari = 0;
    
    protected int hitung(int tahun, String bulan){
        switch(bulan){
            case "Januari":
                jumlahHari = 31;
                break;
            case "Februari":
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            case "Maret":
                jumlahHari = 31;
                break;
            case "April":
                jumlahHari = 30;
                break;
            case "Mei":
                jumlahHari = 31;
                break;
            case "Juni":
                jumlahHari = 30;
                break;
            case "Juli":
                jumlahHari = 31;
                break;
            case "Agustus":
                jumlahHari = 31;
                break;
            case "September":
                jumlahHari = 30;
                break;
            case "Oktober":
                jumlahHari = 31;
                break;
            case "November":
                jumlahHari = 30;
                break;
            case "Desember":
                jumlahHari = 31;
                break;
            default:
                jumlahHari = 0;
                break;
        }
        return jumlahHari;
    }
}
