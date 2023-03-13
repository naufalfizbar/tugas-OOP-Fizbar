/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertama; // 13 Maret 2023

import java.util.Scanner; //biar ambil semua class dan keliatan pake skenner
import java.util.Locale; //karna pake float
/**
 *
 * @author Naufal Akbar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); //buat FLOAT
        
        int pilihan = 0;

    while (pilihan != 3) {
      System.out.println("\nMenu Utama");
      System.out.println("1. Balok");
      System.out.println("2. Tabung");
      System.out.println("3. Keluar");

      System.out.print("Masukkan pilihan Anda: ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1: //segi4
          System.out.print("Masukkan panjang balok: ");
          float panjang = input.nextFloat();
          System.out.print("Masukkan lebar balok: ");
          float lebar = input.nextFloat();
          System.out.print("Masukkan tinggi balok: ");
          float tinggi = input.nextFloat();
          
          persegipanjang segipanjang = new persegipanjang(panjang, lebar);
          System.out.println("Luas persegi panjang: " + segipanjang.itungluas());
          System.out.println("Keliling persegi panjang: " + segipanjang.itungkeliling());
          
          balok segibalok = new balok(panjang, lebar, tinggi);
          System.out.println("Volume balok: " + segibalok.itungvolume());
          System.out.println("Luas permukaan balok: " + segibalok.itungLpermukaan());
          break;

        case 2: //lingkaran dan tabung
          System.out.print("Masukkan jari-jari tabung: ");
          float jari2 = input.nextFloat();
          System.out.print("Masukkan tinggi tabung: ");
          Float tinggiTabung = input.nextFloat();

         
          lingkaran lingkaran = new lingkaran(jari2);
          System.out.println("Luas lingkaran: " + lingkaran.itungluas());
          System.out.println("Keliling lingkaran: " + lingkaran.itungkeliling());
          
          tabung tabung = new tabung(jari2, tinggiTabung);
          System.out.println("Volume tabung: " + tabung.itungvolume());
          System.out.println("Luas permukaan tabung: " + tabung.itungLpermukaan());
          break;

        case 3:
          System.out.println("ALHAMDULILLAH JADI. BELAJAR LANJUT BOSS"); //HEHEHE
          break;

        default:
          System.out.println("Pilihan tidak tersedia.");
          break;
      }
    }

    input.close();
        
    }
    
}
