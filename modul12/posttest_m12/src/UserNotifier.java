// ISP: Interface besar disederhanakan menjadi satu kontrak spesifik. Setiap implementasi hanya akan menentukan jenis notifikasinya masing-masing tanpa metode kosong.
public interface UserNotifier {
    void notification(String message);
}

// SRP: EmailSystem sekarang hanya bertugas mengirimkan email. Tidak ada lagi implementasi kosong untuk SMS atau WhatsApp.
class EmailSystem implements UserNotifier {
    @Override
    public void notification(String message) {
        System.out.println("Mengirimkan notifikasi resi via Email: " + message);
    }
}
// OCP: Jika ingin menambah sistem notifikasi baru, cukup buat kelas baru tanpa mengubah antarmuka UserNotifier atau kelas EmailSystem.
class SMSSystem implements UserNotifier {
    @Override
    public void notification(String message) {
        System.out.println("Mengirimkan notifikasi resi via SMS: " + message);
    }
}
class WhatsAppSystem implements UserNotifier {
    @Override
    public void notification(String message) {
        System.out.println("Mengirimkan notifikasi resi via WhatsApp: " + message);
    }
}
