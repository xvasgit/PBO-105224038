public abstract class Rekening implements Otorisasi {
    private String noRek;
    private String namaPemilik;
    private double saldo;
    private int pin;
    private final BukuMutasi bukumutasi;

    public Rekening(String noRek, String namaPemilik, double saldo, int pin){
    this.noRek = noRek;
    this.namaPemilik = namaPemilik;
    this.saldo = saldo;
    this.pin = pin;
    this.bukumutasi = new BukuMutasi(this.noRek , this.namaPemilik);
    }

    public String getRek(){return noRek;}
    public String getNama(){return namaPemilik;}
    public double getsaldo(){return saldo;}
    public void setRek(String noRek){this.noRek = noRek;}
    public void namaPemilik(String namaPemilik){this.namaPemilik = namaPemilik;}
    public int getPin(){return pin;}
    

    public void tarik(double saldo){
        this.saldo-=saldo;
        this.bukumutasi.catatLog("Tarik saldo -Rp" + saldo);
    }
    public void setor(double saldo){
        this.saldo += saldo;
        this.bukumutasi.catatLog("Setor saldo +Rp" + saldo);
    }

    @Override
    public boolean verifikasiPIN(int pin){
        if(this.pin == pin){
            return true;
        }else{
            return false;
        }
    }
}
