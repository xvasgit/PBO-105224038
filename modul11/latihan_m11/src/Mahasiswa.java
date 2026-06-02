//soal 2
public class Mahasiswa {
    public void setSksMaksimal(int sks){
        if(sks <= 24 && sks >= 2){
            System.out.println("Diambil SKS sebanyak " + sks);
        }else{
            throw new IllegalArgumentException("Kesalahan sistem: Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        }
    }

    //soal 3
    public int sisaSks;
    public void ambilMataKuliah(String namaMatkul,int bebanSks){
        if(bebanSks > this.sisaSks){
            throw new SksTidakCukupException("Sisa SKS tidak cukup, tidak dapat mengambil mata kuliah " + namaMatkul);
        }
    }
}
