import java.util.Scanner;
public class Pelanggan23 {
    public static void main(String[] args) {
    Scanner input23 = new Scanner(System.in);
    String nama;
    char jawab;
    int jml = 0;
    do {
        System.out.print("Masukkan nama pelanggan: ");
        nama = input23.nextLine();
        jml++;
        System.out.print("Apakah Anda ingin memasukkan nama pelanggan baru (Y/T)? ");
        jawab = input23.nextLine() .charAt (0);
    } while (jawab == 'y' || jawab == 'Y');
    System.out.print("Jumlah pelanggan yang Anda masukkan = " + jml);
    }
}