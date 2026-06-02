public class SaldoTidakMencukupiException extends Exception {
    private double saldoKurang;
    public SaldoTidakMencukupiException(double saldoKurang, String pesan){
        super(pesan);
        this.saldoKurang = saldoKurang;
    }
    public double getsaldoKurang(){return this.saldoKurang;}

}
