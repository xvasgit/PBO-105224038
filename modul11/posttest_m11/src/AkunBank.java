public class AkunBank {
    private String nomorRekening;
    private double saldo;
    private double totalTransferHariIni;

    public AkunBank(String no,double sldo,double total){
        nomorRekening = no;
        saldo = sldo;
        totalTransferHariIni = total;
    }
    public String getNomorRekening(){
    return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tambahSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getTotalTransferHariIni() {
        return totalTransferHariIni;
    }

    public void setTotalTransferHariIni(double totalTransferHariIni) {
        this.totalTransferHariIni = totalTransferHariIni;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException{
        if(this.saldo < nominal){
            double kurang = nominal - this.saldo;
            throw new SaldoTidakMencukupiException(kurang, "Saldo tidak cukup!");
        }else{
            this.saldo -= nominal;
            System.out.println("Saldo berhasil ditarik!");
        }
    }

    public void transfer(AkunBank tujuan, double nominal) throws BatasTransferHarianException, SaldoTidakMencukupiException{
        if(nominal > 10000000.0){
            throw new BatasTransferHarianException("Melebihi batas transfer harian!");
        }else if(this.saldo < nominal){
            double kurang = nominal - this.saldo;
            throw new SaldoTidakMencukupiException(kurang, nomorRekening);
        }else{
            this.saldo -= nominal;
            tujuan.tambahSaldo(nominal);
            this.totalTransferHariIni += nominal;
            System.out.println("Transfer ke akun tujuan berhasil");
        }
    }

}
