import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Judul
        System.out.println("============================================");
        System.out.println("\t\tKelola Pesanan Kafe");
        System.out.println("============================================\n");

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan = ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        System.out.println();

        // Deklarasi array
        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        // Memasukkan nama dan harga pesanan
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + "\t: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + "\t: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        // Menghitung total harga
        double totalHarga = 0;
        for (double harga : hargaPesanan) {
            totalHarga += harga;
        }

        // Output daftar pesanan dan total harga
        System.out.println("\n============================================");
        System.out.println("\t\tDaftar Pesanan");
        System.out.println("============================================");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + "\t\t: Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Harga\t\t: Rp " + totalHarga);
    }
}
