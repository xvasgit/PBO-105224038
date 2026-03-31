public class App {
    public static void main(String[] args) throws Exception {
        // nomor 1 (membuat objek)
        MesinKopi mesinLobby = new MesinKopi();

        // nomor 2 (memanggil method void)
        mesinLobby.air = 200;
        mesinLobby.bijiKopi = 100;
        mesinLobby.susu = 100;
        mesinLobby.isiUlangBahan(10.5, 20, 5);
        

        // nomor 3 (memanggil method boolean)
        System.out.println(mesinLobby.cekKetersediaanCappuccino());

        // nomor 4 (mencoba konstruktor inisialisasi)
        MesinKopi mesinKantor = new MesinKopi();
        System.out.println(mesinKantor.bijiKopi);
        System.out.println(mesinKantor.susu);
        System.out.println(mesinKantor.air);

    }
}
