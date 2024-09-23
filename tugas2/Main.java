
package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println("Pilih bangun datar: ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                bangunDatar.hitungPersegi(sisi);
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                bangunDatar.hitungPersegiPanjang(panjang, lebar);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                bangunDatar.hitungLingkaran(jariJari);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
