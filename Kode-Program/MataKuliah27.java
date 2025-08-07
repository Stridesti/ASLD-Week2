public class MataKuliah27 {
        String kodeMK;
        String namaMk;
        int sks;
        int jumlahJam;
    
        public MataKuliah27() {
            this.kodeMK = "";
            this.namaMk = "";
            this.sks = 0;
            this.jumlahJam = 0;
        }
    
        public MataKuliah27(String kodeMK, String nama, int sks, int jumlahJam) {
            this.kodeMK = kodeMK;
            this.namaMk = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }
    
        public void tampilInformasi() {
            System.out.println("-----------------------");
            System.out.println("Kode MK: " + kodeMK);
            System.out.println("Nama: " + namaMk);
            System.out.println("SKS: " + sks);
            System.out.println("Jumlah Jam: " + jumlahJam);
            System.out.println("-----------------------");
        }
    
        public void ubahSKS(int sksBaru) {
            this.sks = sksBaru;
            System.out.println("SKS telah diubah menjadi: " + this.sks);
        }
    
        public void tambahJam(int jam) {
            this.jumlahJam += jam;
            System.out.println("Jumlah jam telah ditambahkan. Jumlah jam baru: " + jumlahJam);
        }
    
        public void kurangiJam(int jumlahJamBaru) {
            if (jumlahJam >= jumlahJamBaru) {
                this.jumlahJam -= jumlahJamBaru;
                System.out.println("Jumlah jam telah dikurangi. Jumlah jam baru: " + jumlahJam);
            } else {
                System.out.println("Pengurangan jam tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
            }
        }
}
