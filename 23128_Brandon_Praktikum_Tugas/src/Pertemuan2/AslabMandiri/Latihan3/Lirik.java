  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.AslabMandiri.Latihan3;

/**
 *
 * @author brand
 */
public class Lirik {
    // variabel bingo sebagai penampung perubahan lirik
    String bingo;
    
    // constructor dari class Lirik
    public Lirik(int jumlahTepuk){
        // mengganti lirik sesuai jumlah tepuk tangan yang ada pada lirik
        switch (jumlahTepuk){
            case 0:
                this.bingo = "B-I-N-G-O";
                break;
            case 1:
                this.bingo = "(clap)-I-N-G-O";
                break;
            case 2:
                this.bingo = "(clap)-(clap)-N-G-O";
                break;
            case 3:
                this.bingo = "(clap)-(clap)-(clap)-G-O";
                break;
            case 4:
                this.bingo = "(clap)-(clap)-(clap)-(clap)-O";
                break;
            case 5:
                this.bingo = "(clap)-(clap)-(clap)-(clap)-(clap)";
                break;
        }
    }
    
    // method untuk menampilkan seluruh lirik
    public void sing() {
        System.out.println("There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                this.bingo + "\n" +
                this.bingo + "\n" +
                this.bingo + "\n" +
                "And Bingo was his name-o.\n");
    }
}
