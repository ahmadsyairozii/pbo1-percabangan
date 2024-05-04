import java.util.Scanner;

public class percabangan_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (1-3): ");
        int angka = scanner.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka 1");
                break;
            case 2:
                System.out.println("Anda memilih angka 2");
                break;
            case 3:
                System.out.println("Anda memilih angka 3");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid.");
        }
    }
}