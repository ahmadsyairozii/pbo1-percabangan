import java.util.Scanner;

public class percabangan_if {
    public static void main(String[] args) {
        
        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaan : Rp. ");
        belanja = scan.nextInt();

        // cek apakah dia belanja diatas 100000
        if (belanja > 100000) {
            System.out.println("Selamat, Anda Mendapatkan Hadiah!");
        } else if (belanja < 100000) {
            System.out.println("Maaf, Anda Tidak Mendapatkan Hadiah.");
        }
        System.out.println("Terima Kasih");
    }
}
