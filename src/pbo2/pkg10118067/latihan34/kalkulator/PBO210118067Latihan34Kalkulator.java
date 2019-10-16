/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan hasil hitung nilai tertentu
 */
public class PBO210118067Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.print("Masukkan Angka ke-1 : ");
            kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
            kalkulator.value2 = scanner.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
        
        
        
    }
    
}
