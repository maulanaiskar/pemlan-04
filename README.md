# pemlan-04
Praktikum Pemrograman Lanjut Bab 4. Encapsulation

Buatlah sebuah daftar keanggotaan perpustakaan yang menyimpan beberapa data diantaranya:
1. Nama
2. No KTP
3. Alamat
4. Tempat, Tanggal Lahir (Class)
5. Nomor telepon
6. Alamat email

Dengan ketentuan sebagai berikut:
1. No KTP (Harus berjumlah 16 karakter angka semua)
2. Nomor telepon harus hanya bisa menyimpan angka
3. Alamat email harus valid (memiliki @ dan .) contoh: fadeltd@hotmail.com

Buatlah kelas Tanggal pada package yang berbeda untuk menyimpan tanggal lahir
Class Tanggal berisikan atribut:
1. tanggal: int
2. bulan: int
3. tahun: int

Saat menginputkan tanggal lahir, input dimulai dari tahun terlebih dahulu, dilanjutkan dengan bulan, kemudian tanggal.
Jika tahun kabisat, maka 29 Februari diizinkan, selain kabisat batas tanggal pada bulan Februari adalah 28.
Januari, Maret, Mei, Juli, Agustus, Oktober, Desember memiliki batas tanggal 31.
April, Juni, September, November memiliki batas tanggal 30.
