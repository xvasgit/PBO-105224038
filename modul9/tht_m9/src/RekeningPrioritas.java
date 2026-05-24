public class RekeningPrioritas extends Rekening {
    public RekeningPrioritas(String noRek, String namaPemilik, double saldo, int pin){
        super(noRek, namaPemilik, saldo, pin);
    }

    @Override
    public void tarik(double saldo){
        if(saldo >= 100000.0){//syarat minimum untuk tarik saldo
            super.tarik(saldo);
        }else{
            System.out.println("Minimum untuk tarik saldo adalah Rp100.000");
        }
    }
    @Override
    public boolean verifikasiPIN(int pin){return super.verifikasiPIN(pin);}
}
