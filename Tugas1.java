import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Meminta user untuk memasukkan jumlah nilai mahasiswa
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        // Membuat array untuk menyimpan nilai-nilai mahasiswa
        int[] nilai = new int[jumlahMahasiswa];
        
        // Memasukkan nilai mahasiswa ke dalam array
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        
        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("Nilai mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        
        // Menghitung nilai rata-rata
        int total = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / jumlahMahasiswa;
        System.out.println("Nilai rata-rata: " + rataRata);
        
        // Menentukan nilai tertinggi dan terendah
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        
        // Menampilkan nilai tertinggi dan nilai terendah
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
  
    }
}
