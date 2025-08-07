|  | Algoritma dan Struktur Data|
|--|--|
| Nama       |  Tri Desti Sasmita|
| Nim        |  244107020167|
| Kelas | TI-1H |
| Repository |[Link] (https://github.com/Stridesti/AlgoritmaDan-StrukturData.git)|



# Jobsheet 2 object

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

verifikasi hasil percobaan
---

---

### 2.1.3 Pertanyaan

1. Sebutkan dua karakteristik class atau object!
    yaitu atribut dan method:
    - Atribut adalah data atau ciri-ciri yang dimiliki
    oleh suatu object.
    Atribut ini menyimpan informasi tentang object tersebut.
    - Method adalah fungsi yang dimiliki oleh object. Method menggambarkan apa yang bisa dilakukan oleh object tersebut (perilaku).
    Jadi atribut: ciri" atau data dari object, sedangkan method: fungsi atau perilaku object.

2. Pada Class Mahasiswa27 memiliki 4 atribut, yaitu:
    nama, nim, kelas dan ipk.

3. pada Class Mahasiswa27 memiliki 4 Method, Yaitu:
    - tampilkanInformasi()
    - ubahKelas(String kleasBaru)
    - updateIpk(double ipkBaru)
    - nilaiKinerja()

4.   void updateIpk(double ipkBaru) {
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            return;
        }
        ipk = ipkBaru;
    }

5. Cara Kerja Method `nilaiKinerja()`, yaitu:
    - Data Input : Menggunakan atribut ipkyang merupakan nilai Indeks Prestasi Kumulatif siswa.
    - Evaluasi Kinerja : Menggunakan struktur kontrol if-elseuntuk menentukan kategori kinerja berdasarkan nilai ipk.
    - Pengembalian Nilai : Mengembalikan string yang menggambarkan kinerja siswa.

    Kriteria yang Digunakan
    IPK >= 3,5 : Kinerja sangat baik
    IPK >= 3.0 : Kinerja baik
    IPK >= 2.0 : Kinerja cukup
    IPK < 2.0 : Kinerja kurang
    Nilai yang Dikembalikan
    Metode nilaiKinerja()   mengembalikan string yang menjelaskan kinerja siswa berdasarkan nilai ipk. Contoh keluaran:
    "Kinerja sangat baik"
    "Kinerja baik"
    "Kinerja cukup"
    "Kinerja kurang"


## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method

verifikasi hasil percobaan
---
![percobaan 2](<Screenshot 2025-08-07 095129.png>)
---

### 2.2.3 Pertanyaan

1. Pada class `MahasiswaMain27`, baris kode yang digunakan untuk proses instansiasi adalah:
    Mahasiswa27 mhs1 = new Mahasiswa27();
Instansiasi : Proses ini menciptakan objek baru dari kelas Mahasiswa27.
Nama Objek : Objek yang dihasilkan dari proses instansiasi ini diberi nama mhs1.

2. Untuk mengakses atribut dan metode dari suatu objek dalam Java, Anda dapat menggunakan operator titik (`.`).
    Cara Mengakses Atribut
    1. Membuat Objek : Pertama, Anda harus memiliki objek dari kelas yang bersangkutan.
    2. Menggunakan Operator Titik : Gunakan operator titik untuk mengakses atribut.

    Cara Mengakses Method
    1. Membuat Objek : Pastikan Anda memiliki objek dari kelas yang bersangkutan.
    2. Menggunakan Operator Titik : Gunakan operator titik untuk memanggil metode.

3. Hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda karena terdapat perubahan pada atribut objek mhs1 antara kedua pemanggilan tersebut.
    1. Pemanggilan Pertama:
    Pada pemanggilan pertama, method tampilkanInformasi() dipanggil sebelum ada perubahan pada atribut kelas dan ipk.
    Atribut yang ditampilkan adalah nilai awal yang telah di-set:
    nama: "Muhammad Ali Farhan"
    nim: "2241720171"
    kelas: "SI 2J"
    ipk: 3.55

    2. Pemanggilan Kedua:
    Setelah pemanggilan pertama, method ubahKelas("SI 2K") dipanggil, yang mengubah nilai atribut kelas.Kemudian, method updateIpk(3.60) dipanggil,mengubah nilai atribut ipk menjadi 3.60.Ketika tampilkanInformasi() dipanggil lagi, method ini menampilkan nilai atribut yang telah diperbarui.


## 2.3 Percobaan 3: Membuat Konstruktor

Verifikasi Hasil Percobaan
---
![Percobaan 3](<Screenshot 2025-08-07 113955.png>)
---

### 2.3.3 Pertanyaan

1. konstruktor berparameter
    public Mahasiswa27(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

2. Membuat objek mhs2 dari class Mahasiswa27 memanggil konstruktor berparameter.konstruktor ini menerima empat argumen, yaitu:
    nama, nim, ipk dan kelas
dan langsung di inisialisasi dengan nilai yang diberikan saat objek dibuat.

3. Jika menghapus konstruktor default (konstruktor tanpa parameter) dari class Mahasiswa, dan class tersebut hanya memiliki konstruktor berparameter, maka program akan mengalami kesalahan saat mencoba membuat objek Mahasiswa tanpa menyertakan argumen.

4. Tidak, metode dalam kelas Mahasiswa tidak harus diakses secara berurutan setelah instansiasi objek, dapat memanggil metode dalam urutan yang diinginkan, asalkan kondisi yang diperlukan untuk menjalankan metode tersebut terpenuhi.Namun, jika ada ketergantungan antar metode (misalnya, satu metode mengubah nilai yang digunakan oleh metode lain), perlu memanggil metode yang mengubah nilai terlebih dahulu.

5. berikut objek baru `mhsSasmita` menggunakan konstruktor berparameter dari clas `Mahasiswa27`
    Mahasiswa27 mhsSasmita = new Mahasiswa27("Sasmita", "2141720150", 3.15, "TI 2M");


# 2.4 Tugas Latihan Praktikum 

1. ada 2 Class MataKuliah27.java & MataKuliahMain27.java

Hasil Running
---
![Soal 1](<Screenshot 2025-08-07 130434.png>)
---


2. ada 2 Class Dosen27.java & DosenMain27.java

Hasil Running
---
![Soal 2](<Screenshot 2025-08-07 133551.png>)
---
