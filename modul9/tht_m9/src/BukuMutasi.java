public class BukuMutasi {
    private String noRek;
    private String namaPemilik;


    public BukuMutasi(String noRek, String namaPemilik){
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
    }

    public void catatLog(String aktivitas){
        System.out.println("(Mutasi) " + noRek + " :" + aktivitas);
    }
}
