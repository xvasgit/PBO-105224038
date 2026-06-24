public class KRSRepository {
    private DatabaseStorage storage;

    public KRSRepository(DatabaseStorage storage) {
        this.storage = storage;
    }

    public void simpanRiwayat() {
        storage.simpanDataKRS();
    }
}
