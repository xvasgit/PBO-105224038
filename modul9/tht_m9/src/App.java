import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Nasabah nasabah = null;
        CustomerService cs = new CustomerService();
        Rekening rekeningAktif = null;

        int nomorUrut = 1001;//untuk isi noRek
        boolean jalan = true;

        while(jalan){
            System.out.println("\t\tSistem NeoBank");
            System.out.println("1. Registrasi nasabah");
            System.out.println("2. Buka rekening");
            System.out.println("3. Login rekening");
            System.out.println("4. Setor saldo");
            System.out.println("5. Tarik saldo");
            System.out.println("6. Hubungi customer service");
            System.out.println("7. Tutup paksa profil nasabah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scan.nextInt();
            
            switch(pilihan){
                case 1:
                    scan.nextLine(); // membersihkan enter setelah input angka
                    System.out.print("Nama nasabah: ");
                    String nama = scan.nextLine();

                    nasabah = new Nasabah(nama, new Rekening[3]);
                    rekeningAktif = null;

                    System.out.println("Profil nasabah berhasil dibuat.");
                    break;

                case 2:
                    if (nasabah == null) {
                        System.out.println("Registrasikan nasabah terlebih dahulu.");
                        break;
                    }

                    System.out.println("Jenis rekening:");
                    System.out.println("1. Reguler");
                    System.out.println("2. Prioritas");
                    System.out.print("Pilih jenis: ");
                    int jenis = scan.nextInt();

                    System.out.print("Saldo awal: Rp");
                    double saldoAwal = scan.nextDouble();

                    String noRek = "NB" + nomorUrut;
                    nomorUrut++;

                    System.out.print("Buat PIN: ");
                    int pinBaru = scan.nextInt();

                    Rekening rekeningBaru;

                    if (jenis == 1){
                        rekeningBaru = new RekeningReguler(noRek, nasabah.getNama(), saldoAwal,pinBaru);
                    } else if (jenis == 2){
                        rekeningBaru = new RekeningPrioritas(noRek, nasabah.getNama(), saldoAwal,pinBaru);
                    } else{
                        System.out.println("Jenis rekening tidak valid.");
                        break;
                    }

                    nasabah.tambahRekening(rekeningBaru);
                    System.out.println("Silakan login terlebih dahulu untuk transaksi.");
                    break;

                case 3:
                    if (nasabah == null) {
                        System.out.println("Belum ada profil nasabah aktif.");
                        break;
                    }

                    if (nasabah.getJumlahRek() == 0) {
                        System.out.println("Nasabah belum memiliki rekening.");
                        break;
                    }

                    nasabah.tampilkanRekening();

                    System.out.print("Pilih rekening ke : ");
                    int pilihRekening = scan.nextInt();

                    Rekening rekeningDipilih = nasabah.getRekening(pilihRekening - 1);

                    if (rekeningDipilih == null) {
                        System.out.println("Rekening tidak ditemukan.");
                        break;
                    }

                    System.out.print("Masukkan PIN: ");
                    int pin = scan.nextInt();

                    if (!rekeningDipilih.verifikasiPIN(pin)) {
                        System.out.println("Login gagal. PIN salah.");
                        break;
                    }

                    rekeningAktif = rekeningDipilih;
                    System.out.println("Login berhasil ke rekening " + rekeningAktif.getRek());
                    break;

                case 4:
                    if (rekeningAktif == null) {
                        System.out.println("Buat rekening terlebih dahulu.");
                        break;
                    }

                    System.out.print("Nominal setor: Rp");
                    double setor = scan.nextDouble();

                    rekeningAktif.setor(setor);
                    System.out.println("Saldo sekarang: Rp" + rekeningAktif.getsaldo());
                    break;

                case 5:
                    if (rekeningAktif == null) {
                        System.out.println("Login atau buat rekening terlebih dahulu.");
                        break;
                    }

                    System.out.print("Nominal tarik: Rp");
                    double tarik = scan.nextDouble();

                    rekeningAktif.tarik(tarik);
                    System.out.println("Saldo sekarang: Rp" + rekeningAktif.getsaldo());
                    break;

                case 6:
                    if (nasabah == null) {
                        System.out.println("Belum ada profil nasabah aktif.");
                        break;
                    }

                    nasabah.lapor(cs);
                    break;

                case 7:
                    nasabah = null;
                    rekeningAktif = null;

                    System.out.println("Profil nasabah ditutup paksa.");

                    // Asosiasi: saat objek Nasabah diset null, objek Rekening tidak otomatis hancur secara konsep, karena Rekening adalah objek mandiri yang hanya ditampung oleh Nasabah.
                    // Komposisi: BukuMutasi dibuat langsung di constructor Rekening, sehingga BukuMutasi bergantung pada objek Rekening. Hasilnya, BukuMutasi hancur bersama nasabah
                    break;

                case 0:
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        }
        scan.close();
    }
}
