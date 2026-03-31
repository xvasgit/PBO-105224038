import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nominal;
        DuitKu user1 = new DuitKu();//buat objek baru
        System.out.print("Masukkan nama : ");
        user1.namaLengkap = input.nextLine();
        System.out.print("Masukkan nomor telp : ");
        user1.nomorPonsel = input.nextLine();
        
        System.out.print("Masukkan nominal setoran : ");
        nominal = input.nextInt();
        user1.setorUang(nominal);//panggil method void setorUang

        System.out.println("(1) Mencoba membayar tagihan listrik sebesar Rp60.000");
        user1.tagihan(60000);//panggil method void tagihan pertama (case saldo ga cukup)

        System.out.print("Masukkan nominal setoran : ");
        nominal = input.nextInt();
        user1.setorUang(nominal);//panggil method void setorUang untuk nambah saldo

        System.out.println("(2) Mencoba membayar tagihan listrik sebesar Rp60.000");
        user1.tagihan(60000);//panggil method void tagihan kedua (case saldo cukup)

        //cetak ulang profil
        System.out.println("\nNama : " + user1.namaLengkap);
        System.out.println("Nomor Telp : " + user1.nomorPonsel);
        System.out.println("Saldo : Rp" + user1.saldo);
        input.close();
    }
}
