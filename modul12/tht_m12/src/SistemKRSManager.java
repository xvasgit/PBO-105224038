public class SistemKRSManager {
    private KRSValidator validator;
    private KRSPdfGenerator pdfGenerator;
    private KRSRepository repository;

    public SistemKRSManager(DatabaseStorage storage) {
        this.validator = new KRSValidator();
        this.pdfGenerator = new KRSPdfGenerator();
        this.repository = new KRSRepository(storage);
    }

    public void prosesPengisianKRS(SkemaKalkulasiUKT skemaUKT) {
        System.out.println("--- Memulai Proses KRS ---");
        
        validator.validasiPrasyarat();
        
        UKTCalculator calculator = new UKTCalculator(skemaUKT);
        calculator.jalankanKalkulasi();
        
        pdfGenerator.cetakDrafPDF();
        repository.simpanRiwayat();
        
        System.out.println("--- Proses KRS Selesai ---\n");
    }
}
