  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.Latihan3;

/**
 *
 * @author brand
 */
public class Lirik {
    String bingo;
    public Lirik(int jumlahTepuk){
        
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
    
    public void sing() {
        System.out.println("There was a farmer who had a dog,\n" +
                "And Bingo was his name-o.\n" +
                this.bingo + "\n" +
                this.bingo + "\n" +
                this.bingo + "\n" +
                "And Bingo was his name-o.\n");
    }
}
