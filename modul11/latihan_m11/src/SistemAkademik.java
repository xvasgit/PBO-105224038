import java.io.FileNotFoundException;
//soal 4
public class SistemAkademik {
    public void gabungKelas(String kodeKelas, int kuotaTersedia) throws KelasPenuhException{
        if(kuotaTersedia <= 0){
            throw new KelasPenuhException("Kelas penuh!");
        }
    }

    //soal 5
    public void cetakDokumenKrs(String namaFile) throws FileNotFoundException{
        if(!namaFile.equals("krs_valid.txt")){
            throw new FileNotFoundException();
        }
    }
}