// nomor 1 (membuat class)
public class MesinKopi {
    double bijiKopi, air, susu;
    
    //nomor 2 (method void)
    public void isiUlangBahan(double bijiKopibaru, double airbaru, double susubaru){
        this.bijiKopi = this.bijiKopi + bijiKopibaru;
        this.air = this.air + airbaru;
        this.susu = this.susu + susubaru;
        System.out.println("Bahan baku berhasil diisi ulang");
    }

    //nomor 3 (method boolean)
    public boolean cekKetersediaanCappuccino(){
        if(this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100){
            return true;
        }else{
            return false;
        }
    }

    //nomor 4 (kontruktor tanpa parameter)
    public MesinKopi(){
        this.bijiKopi = 0;
        this.air = 10;
        this.susu = 0;
    }
}
