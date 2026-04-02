public class RekeningBank {
    String nomorRekening;
    private int saldo;

    public int getSaldo(){
        System.out.println("Saldo berisi Rp" + saldo);
        return saldo;
    }
    public int setSaldo(int saldoBaru){
        if(saldoBaru < 0){
            System.out.println("Saldo tidak bisa minus!");
            return saldo;
        }else{
            System.out.println("Saldo berhasil ditambahkan sebanyak Rp" + saldoBaru);
            return saldoBaru;
        }
    }
}
