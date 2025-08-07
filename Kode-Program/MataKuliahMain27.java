public class MataKuliahMain27 {
    public static void main(String[] args) {
        MataKuliah27 mk1 = new MataKuliah27();
        mk1.kodeMK = "IF102";
        mk1.namaMk = "Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam =120;

        // Menampilkan informasi mata kuliah
        mk1.tampilInformasi();
        mk1.ubahSKS(5);
        mk1.tampilInformasi();
        mk1.tambahJam(10);
        mk1.kurangiJam(25);
        mk1.tampilInformasi();
        mk1.kurangiJam(120); // Pengurangan jam yang tidak valid
        mk1.tampilInformasi();

        // Membuat objek dengan konstruktor berparameter
        MataKuliah27 mk2 = new MataKuliah27("IF101", "Algoritma dan Struktur Data", 4, 6);
        mk2.tampilInformasi();
    }
}
