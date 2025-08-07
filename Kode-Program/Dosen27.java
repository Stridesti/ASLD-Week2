public class Dosen27 {
    String idDosen;
    String namaDosen;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen27() {
        this.idDosen = "";
        this.namaDosen = "";
        this.statusAktif = true;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    public Dosen27(String idDosen, String namaDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilkanInformasi() {
        System.out.println("-----------------------");
        System.out.println("Informasi Dosen:");
        System.out.println("-----------------------");
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("-----------------------");
    }

    public void ubahStatusAktif(boolean statusBaru) {
        this.statusAktif = statusBaru;
        System.out.println("Status aktif telah diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        return masaKerja >= 0 ? masaKerja : 0; // Pastikan tidak negatif
    }

    public void ubahBidangKeahlian(String bidangKeahlianBaru) {
        this.bidangKeahlian = bidangKeahlianBaru;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
