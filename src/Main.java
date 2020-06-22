import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Anggota member1 = new Anggota();

        System.out.print("Masukan Nama: ");
        String nama = in.nextLine();
        member1.setNama(nama);

        System.out.print("Masukan NIK: ");
        String nik = in.nextLine();
        member1.setNIK(nik);
        while (!member1.cekNIK()) {
            System.out.print("Masukan NIK: ");
            nik = in.nextLine();
            member1.setNIK(nik);
        }
        System.out.print("Masukan alamat: ");
        String alamat = in.nextLine();
        member1.setAlamat(alamat);

        System.out.print("Masukan tempat lahir: ");
        String tempat = in.nextLine();
        member1.setTempat(tempat);
        System.out.print("Masukkan tahun: ");
        int tahun = in.nextInt();
        System.out.print("Masukkan bulan: ");
        int bulan = in.nextInt();
        System.out.print("Masukkan tanggal:");
        int tanggal = in.nextInt();
        member1.setTanggal(tahun, bulan, tanggal);
        while (!member1.getStatusTanggal()) {
            System.out.print("Masukkan tahun: ");
            tahun = in.nextInt();
            System.out.print("Masukkan bulan: ");
            bulan = in.nextInt();
            System.out.print("Masukkan tanggal:");
            tanggal = in.nextInt();
            member1.setTanggal(tahun, bulan, tanggal);
        }
        in.nextLine();
        System.out.print("Masukan telp: ");
        String telp = in.nextLine();
        member1.settelp(telp);
        while (!member1.cektelp()) {
            System.out.print("Masukan telp: ");
            telp = in.nextLine();
            member1.settelp(telp);
        }
        System.out.print("Masukkan email: ");
        String email = in.nextLine();
        member1.setEmail(email);
        while (!member1.cekEmail()) {
            System.out.print("Masukkan email: ");
            email = in.nextLine();
            member1.setEmail(email);

        }
        member1.cetakAnggota();
    }

}
