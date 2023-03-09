/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasigudangoke;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AplikasiGudangOke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
     
     String nama, barang;
     int qty;
     double hargabeli, hargajual;
        
        System.out.print("Masukkan nama Anda: ");
        nama = in.nextLine(); 
        System.out.println("");
        
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        System.out.println("");
        
        System.out.println("Selamat Datang " + nama + "!");
        System.out.println("");
        
        System.out.print("Masukkan nama barang yang mau ditambah: ");
        barang = in.next();
        System.out.println("");
        
        System.out.print("Masukkan jumlah barang yang mau ditambah: ");
        qty = in.nextInt();
        System.out.println("");
        
        System.out.print("Masukan harga beli untuk barang tersebut: ");
        hargabeli = in.nextDouble();
        System.out.println("");
        
        System.out.print("Masukan harga jual untuk barang tersebut: ");
        hargajual = in.nextDouble();
        System.out.println("");
        
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        System.out.println("");

        BigDecimal hargabeli1 = new BigDecimal(hargabeli).setScale
        (2, RoundingMode.CEILING);
        BigDecimal hargajual1 = new BigDecimal(hargajual).setScale
        (2, RoundingMode.CEILING);
        
        System.out.println("Nama Barang: " + barang);
        System.out.println("Jumlah Barang: " + qty);
        System.out.println("Harga Beli: Rp. " + hargabeli1);
        System.out.println("Harga Jual: Rp. " + hargajual1);
    }
    
}
