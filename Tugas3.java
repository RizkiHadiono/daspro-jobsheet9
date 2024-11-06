import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        // Judul
        System.out.println("============================================");
        System.out.println("\t\tPencarian Menu");
        System.out.println("============================================\n");

        // Deklarasi array menu
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        // Menampilkan menu
        System.out.println("Daftar Menu : ");
        for (String listMenu : menu) {
            System.out.println("~> " + listMenu);
        }

        // Input menu yang akan dicari
        System.out.println("\n--------------------------------------------\n");
        System.out.print("Masukkan menu yg akan dicari : ");
        String cariMenu = sc.nextLine();

        // Untuk mencari menu
        boolean search = false;
        for (String listMenu : menu) {
            if (listMenu.equalsIgnoreCase(cariMenu)) {
                search = true;
                break;
            }
        }

        // output
        if (search) {
            System.out.println("Menu '" + cariMenu + "' tersedia di menu.");
        } else {
            System.out.println("Menu yg dicari tidak tersedia.");
        }
    }
}
