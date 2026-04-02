//nomor 1
public class Karyawan {
    private String idKaryawan, nama;

    Karyawan(String isiID, String isinama){//konstruktor agar bisa isi nilai langsung
        this.idKaryawan = isiID;
        this.nama = isinama;
    }

    //getter kedua atribut
    public String getID(){
        return idKaryawan;
    }
    public String getNama(){
        return nama;
    }

    //setter kedua atribut
    public void setID(String idBaru){
        this.idKaryawan = idBaru;
        System.out.println("Berhasil diset ID baru");
    }
    public void setNama(String namaBaru){
        this.nama = namaBaru;
        System.out.println("Berhasil diset nama baru");
    }


    //nomor 2
    private double gajiPokok;
    public double getGaji(){//getter
        return gajiPokok;
    }
    public void setGaji(double gajiBaru){//setter
        if(gajiBaru < 0.0){//logika untuk keamanan ekstra
            System.out.println("Gaji pokok tidak boleh kurang dari 0!");
        }else{
            this.gajiPokok = gajiBaru;
            System.out.println("Berhasil diset gaji pokok baru");
        }
    }

    //nomor 3
    private String departemen;
    public void setDepartemen(String departemenBaru){
        this.departemen = departemenBaru;
        System.out.println("Berhasil diset departemen baru");
    }
    public void tampilkanDataKaryawan(){//namipilin profile lengkap
        System.out.println("Profil Karyawan\nID\t\t: " + idKaryawan + "\nNama\t\t: " + nama + "\nDepartemen\t: " + departemen + "\nGaji Pokok\t: Rp" + gajiPokok);
    }
}
