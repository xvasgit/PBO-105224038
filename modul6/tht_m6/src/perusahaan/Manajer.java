package perusahaan;

public class Manajer extends Karyawan{
    private String divisi;
    private int jumlahAnggotaTim;
    
    public Manajer(String id,String nama,int tahun,double gaji,double rating,String divisi,int anggotatim){
        super(id, nama, tahun, gaji, rating);
        //asumsi jumlah anggota tim akan otomatis diset 0 jika input negatif
        if(anggotatim >= 0){
            this.jumlahAnggotaTim = anggotatim;
        }else {
            System.out.println("Jumlah anggota tim tidak valid, otomatis diset ke 0");
            this.jumlahAnggotaTim = 0;
        }
        this.divisi = divisi;
    }

    //setter dan getter
    public String getDivisi(){
        return divisi;
    }
    public int getJumlahAnggotaTim(){
        return jumlahAnggotaTim;
    }
    public void setDivisi(String divisi){
        this.divisi = divisi;
    }
    public void setJumlahAnggotaTim(int anggotatim){
        if(anggotatim >= 0){
            this.jumlahAnggotaTim = anggotatim;
        }else{
            System.out.println("Jumlah anggota tim tidak valid");
        }
    }

    @Override
    public double hitungGajiTotal(){
        double totalGaji = super.hitungGajiTotal();
        totalGaji = totalGaji + this.jumlahAnggotaTim * 300000.0;//bonus manajerial
        double bonusKinerjaEkstra = 0;
        if(super.getRatingKinerja() > 4.5){
            bonusKinerjaEkstra = totalGaji * 0.15;
        }
        return totalGaji + bonusKinerjaEkstra;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("(tambahan Manajer)");//tambahan informasi spesifik manajer
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Jumlah Anggota Tim : " + this.jumlahAnggotaTim);
    }
}
