/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author brand
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double NilaiAkhir;
    
    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, double NilaiAkhir){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.NilaiAkhir = NilaiAkhir;
    }
    
    public String getNIM(){
        return NIM;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public String getMataKuliah(){
        return MataKuliah;
    }
    public double getNilaiAkhir(){
        return NilaiAkhir;
    }
}
