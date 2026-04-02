public class App {
    public static void main(String[] args) throws Exception {
        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "123456"; // menambahkan identitas nomorRekening
        rekening1.setSaldo(-10000); //kondisi error
        rekening1.setSaldo(10000); //kondisi normal
        rekening1.getSaldo(); //panggil metode getSaldo untuk dapat "saldo" yang di-set private
    }
}
