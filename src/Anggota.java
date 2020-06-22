public class Anggota {

    String nik;
    String nama;
    String alamat;
    String email;
    Tanggal tgl_lahir = new Tanggal();
    String telp;
    String tempat;

    public void setNIK(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTanggal(int tahun, int bulan, int tgl) {
        tgl_lahir.setTahun(tahun);
        tgl_lahir.setBulan(bulan);
        tgl_lahir.setTgl(tgl);
    }

    public void settelp(String telp) {
        this.telp = telp;
    }

    public boolean cekNIK() {
        boolean keterangan = true;
        if (nik.length() != 16) {
            System.out.println("NIK harus 16 karakter");
            keterangan = false;
        }
        try {
            long a = Long.parseLong(nik);
        } catch (Exception e) {
            System.out.println("NIK harus angka");
            keterangan = false;
        }
        return keterangan;
    }

    public boolean cektelp() {
        boolean keterangan = true;
        try {
            long a = Long.parseLong(telp);
        } catch (Exception e) {
            System.out.println("telp harus angka");
            keterangan = false;
        }
        return keterangan;
    }

    public boolean cekEmail() {
        boolean keterangan = true;

        if (compareChar(email, '@') == false || compareChar(email, '.') == false) {
            System.out.println("Email tidak valid");
            keterangan = false;
        }

        return keterangan;
    }

    private boolean compareChar(String string, char strComp) {
        boolean statusStr = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == strComp) {
                statusStr = true;
            }
        }
        return statusStr;
    }

    public boolean getStatusTanggal() {
        return tgl_lahir.cekTanggal();
    }

    public void cetakAnggota() {
        System.out.println("------------- Biodata ------------");
        System.out.println("Nama\t: " + nama);
        System.out.println("Nik\t: " + nik);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("TTL\t: " + tempat + ", " + tgl_lahir.getTanggal());
        System.out.println("No Telp\t: " + telp);
        System.out.println("Email\t: " + email);
    }
}