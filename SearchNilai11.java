import java.util.Scanner;

public class SearchNilai11 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        // Variable
        int hasil = 1; 
        
        // Input jumlah nilai yang akan diinput
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        
        // Deklarasi array berdasarkan jumlah yang diinput
        int[] arrNilai = new int[jumlahNilai];
        
        // Perulangan untuk menginput nilai
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + "\t: ");
            arrNilai[i] = sc.nextInt();
        }
        
        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        // Mencari nilai
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1; 
                break;         
            }
        }
        
        // Output
        System.out.println("");
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        }
        else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
