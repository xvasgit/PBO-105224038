public class DuitKu {
    String namaLengkap,nomorPonsel;
    int saldo;
    public DuitKu(){
        saldo = 0;
    }

    public void setorUang(int nominal){
        if(nominal < 10000){
            System.out.println("Minimal setoran harus Rp10.000!");
        }else{
            this.saldo = this.saldo + nominal;
            System.out.println("Berhasil ditambahkan.");
        }
    }

    public void tagihan(int nominal){
        if(saldo < nominal){
            System.out.println("Saldo tidak mencukupi.");
        }else{
            this.saldo = this.saldo - nominal;
            System.out.println("Berhasil membayar tagihan.");
        }
    }
}
