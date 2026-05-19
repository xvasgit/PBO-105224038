import java.util.ArrayList;

public class RumahSakit {
    public String nama;
    public final Ruangan[] r;

    public RumahSakit(String nama){
        this.nama = nama;
        this.r = new Ruangan[2];
        r[0] = new Ruangan("R-01",5);
        r[1] = new Ruangan("R-02",8);
    }

    public void cetakRuang(){
        System.out.println("Daftar ruangan :");
        for(int i=0;i<2;i++){
            System.out.println("- Ruangan " + r[i].noRegist);
        }
    }

    public ArrayList<Dokter> dokter = new ArrayList<Dokter>();;
    public void tambahDokter(Dokter d){
        this.dokter.add(d);
    }
    public void cetakDokter(){
        System.out.println("Daftar dokter yang bertugas : ");
        for(Dokter d : this.dokter){
            System.out.println("- Dr." + d.nama);
        }
    }
}
