public class DosenMain27 {
    public static void main(String[] args) {
        // Membuat objek dengan konstruktor default
        Dosen27 dosen1 = new Dosen27();
        dosen1.idDosen = "D101";
        dosen1.namaDosen = "Prof. Ahmad";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2017;
        dosen1.bidangKeahlian = "Matematika";

        // Menampilkan informasi dosen
        dosen1.tampilkanInformasi();
        dosen1.ubahStatusAktif(true);
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahBidangKeahlian("Statistika");
        dosen1.tampilkanInformasi();

        // Membuat objek dengan konstruktor berparameter
        Dosen27 dosen2 = new Dosen27("D123", "Dr. Budi", true, 2010, "Informatika");
        
        dosen2.tampilkanInformasi();
        dosen2.ubahStatusAktif(false);
        System.out.println("Masa kerja dosen2: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahBidangKeahlian("Sistem Informasi");
    }
}
