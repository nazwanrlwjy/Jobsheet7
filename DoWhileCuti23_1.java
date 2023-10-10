import java.util.Scanner;

public class DoWhileCuti23_1 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc23.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc23.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc23.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                }else {
                    System.out.println("Sisa jatah cuti anda adalah " + jatahCuti);
                }
            }
        } while (jatahCuti > 0);
    }
}