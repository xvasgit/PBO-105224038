public class App {
    public static void main(String[] args) throws Exception {
        AkunBank akunAsal = new AkunBank("832-329", 100000000.0, 0);//saldo 100jt, inisiasi totalTransferharian 0

        AkunBank akunTujuan = new AkunBank("392 021", 0, 0);
        try{
            akunAsal.transfer(akunTujuan, 10000000.0);//berhasil
            akunAsal.transfer(akunTujuan, 100000000.0);//gagal
        }catch(BatasTransferHarianException e){
            System.out.println("Error : " + e.getMessage());
        }catch(SaldoTidakMencukupiException e){
            System.out.println("Error : " + e.getMessage());
        }

        try{
            akunAsal.tarikTunai(700000.0);//700k, berhasil
            akunAsal.tarikTunai(5000000000.0);//gagal
        }catch(SaldoTidakMencukupiException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
