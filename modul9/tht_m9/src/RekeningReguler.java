public class RekeningReguler extends Rekening {
    public RekeningReguler(String noRek, String namaPemilik, double saldo, int pin){
        super(noRek, namaPemilik, saldo, pin);
    }

    @Override
    public void tarik(double saldo){
        super.tarik(saldo + 2500);//biaya admin
    }
    @Override
    public boolean verifikasiPIN(int pin){return super.verifikasiPIN(pin);}
}
