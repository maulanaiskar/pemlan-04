public class Tanggal {

    int tgl, bulan, tahun;

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public boolean cekTanggal() {
        boolean keterangan = true;
        if (tahun % 4 == 0) {
            if (bulan == 2) {
                if (tgl > 29) {
                    System.out.println("Input tanggal salah!");
                    keterangan = false;
                }
            }
        } else {
            if (bulan == 2) {
                if (tgl > 28) {
                    System.out.println("Input tanggal salah!");
                    keterangan = false;
                }
            }
        }
        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
            if (tgl > 31) {
                System.out.println("Input tanggal salah!");
                keterangan = false;
            }
        }
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            if (tgl > 30) {
                System.out.println("Input tanggal salah!");
                keterangan = false;
            }
        }
        if (bulan > 12) {
            System.out.println("Bulan tidak valid");
            keterangan = false;
        }
        return keterangan;
    }

    public String getTanggal() {
        return (tgl + "-" + bulan + "-" + tahun);
    }
}