public class SistemAkademik {
    public void gabungKelas(String kodeKelas, int kuotaTersedia) throws KelasPenuhException{
        if(kuotaTersedia <= 0){
            throw new KelasPenuhException("Kelas penuh!");
        }
    }
}