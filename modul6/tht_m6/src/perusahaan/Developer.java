package perusahaan;

public class Developer extends Karyawan{
    private String level;
    private int jumlahBugFix;

    public Developer(String id,String nama,int tahun,double gaji,double rating,String lvl,int bugfix){
        super(id, nama, tahun, gaji, rating);
        
        //asumsi bugfix akan otomatis diset 0 jika input negatif
        if(bugfix >= 0){
            this.jumlahBugFix = bugfix;
        }else{
            System.out.println("Jumlah bug tidak valid, otomatis diset ke 0");
            this.jumlahBugFix = 0;
        }

        //asumsi ada fitur yang cuma nerima ketiga string berikut pada level
        if(lvl.equalsIgnoreCase("Junior") || lvl.equalsIgnoreCase("Mid") || lvl.equalsIgnoreCase("Senior")){
            this.level = lvl;
        }else{//jika tidak memenuhi, otomatis set ke Junior
            System.out.println("Level Developer tidak valid, otomatis diset sebagai Junior");
            this.level = "Junior";
        }
    }

    //setter dan getter
    public String getLevel(){
        return level;
    }
    public int getJumlahBug(){
        return jumlahBugFix;
    }
    public void setLevel(String lvl){
        this.level = lvl;
    }
    public void setJumlahBug(int bugfix){
        if(bugfix >= 0){
            this.jumlahBugFix = bugfix;
        }else{
            System.out.println("Jumlah bug tidak valid");
        }
    }

    @Override
    public double hitungGajiTotal(){
        double tunjangan = 0;
        //panggil dulu super untuk metode hitungGajiTotal dari class Karyawan
        double gajiTotal = super.hitungGajiTotal();
        if(this.level.equalsIgnoreCase("Mid")){
            tunjangan = 1500000.0;
        }else if(this.level.equalsIgnoreCase("Senior")){
            tunjangan = 3000000.0;
        }
        double bonusBug = 0;
        //memanggil rating kinerja pakai super, karena pakai this tidak akan visible
        if(super.getRatingKinerja() >= 3.0){
            bonusBug = 50000.0 * this.jumlahBugFix;
        }
        return gajiTotal + tunjangan + bonusBug;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();//panggil displayInfo dari class Karyawan
        System.out.println("(tambahan Developer)");//tambahan informasi spesifik dev
        System.out.println("Level\t: " + this.level);
        System.out.println("Jumlah Bug Fix\t: " + this.jumlahBugFix);
    }
}
