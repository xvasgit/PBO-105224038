import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        KeretaRepository repo = new MemoriDataKereta();//buat akses database data kereta
        SistemReserve sistem = new SistemReserve(repo);
        printJadwalSistem printer = new printJadwalSistem();//buat tampilJadwal
        boolean running = true;

        while(running){
            try {
                System.out.println("\n\tMENU UTAMA:");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1-3): ");
                int menu = input.nextInt();
                input.nextLine();//buffer input

                switch (menu) {
                    case 1:
                        System.out.println("\t\tJadwal Kereta");
                        printer.tampilJadwal(sistem.getDaftarKereta());
                        break;
                    case 2:
                        System.out.print("Masukkan Kode Kereta: ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan NIK Penumpang: ");
                        String nik = input.nextLine();
                        System.out.print("Masukkan Nama Penumpang: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Jumlah Tiket: ");
                        int jumlah = input.nextInt();
                        input.nextLine();

                        sistem.pesan(kode, nik, nama, jumlah);
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            }catch (InputMismatchException e){//exception handler untuk masukan bukan angka (jika huruf/simbol)
                System.out.println("Error : Harap masukkan angka, bukan huruf/simbol!");
                input.nextLine();//lanjut di-input buffer
            }catch(DataPenumpangTidakValidException e){
                System.out.println("Error : "+ e.getMessage());
            }catch (RuteTidakDitemukanException e) {
                System.out.println("Error : " + e.getMessage());
            }catch (TiketHabisException e) {
                System.out.println("Error : " + e.getMessage());
                System.out.println("Info Sisa Tiket " + e.namaKereta + ": " + e.sisaKursi + " kursi.");
            }finally {
                //saat keluar dari sistem/loop
                if (!running){
                    input.close();
                }
            }
        }
    }
}
