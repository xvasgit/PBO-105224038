// SRP: Kelas OrderService sekarang hanya memiliki satu tanggung jawab utama yaitu memproses alur pesanan. Tugas menghitung pembayaran dan mengirim notifikasi dilakukan oleh kelas dan interface lain.
public class OrderService {
    // DIP: OrderService bergantung pada interface PaymentMethod dan UserNotifier, bukan bergantung pada CreditCard atau EmailSystem.
    private PaymentMethod paymentMethod;
    private UserNotifier notifier;

    // DIP: Constructor menerima dependency dari luar, tidak langsung hardcode this.payment = new CreditCard()
    public OrderService(PaymentMethod paymentMethod, UserNotifier notifier) {
        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
    }

    // OCP: Tidak lagi menggunakan if-else untuk setiap metode pembayaran. Jika ada metode pembayaran baru, OrderService tidak perlu dimodifikasi sama sekali.
    public void processOrder(double amount) {
        // Pembayaran
        paymentMethod.pay(amount);
        
        // Mengirimkan notifikasi resi
        notifier.notification("Pesanan berhasil diproses sebesar Rp" + amount);
    }
}

// ISP: Memisahkan interface menjadi lebih spesifik. PaymentMethod hanya memiliki pay(), dan Refundable khusus untuk yang bisa refund().
interface PaymentMethod {
    public void pay(double amount);
}
interface Refundable {
    public void refund(double amount);
}

// OCP: Kelas-kelas baru (CreditCard,OVO,Giftcard) bisa dibuat tanpa mengubah logika dari OrderService
class CreditCard implements PaymentMethod, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Sedang bayar pakai kartu kredit sejumlah Rp" + amount);
    }
    @Override
    public void refund(double amount) {
        System.out.println("Sedang refund kartu kredit sejumlah Rp" + amount);
    }
}
class OVO implements PaymentMethod, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Sedang bayar pakai OVO sejumlah Rp" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Sedang refund OVO sejumlah Rp" + amount);
    }
}
class BankTransfer implements PaymentMethod,Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Sedang bayar pakai Transfer Bank reguler sejumlah Rp" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Sedang refund Transfer Bank sejumlah Rp" + amount);
    }
}

// LSP: GiftVoucher hanya mengimplementasikan PaymentMethod. Karena voucher tidak bisa direfund, tidak perlu implements Refundable.
class GiftVoucher implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Sedang bayar pakai Gift Voucher sejumlah Rp" + amount);
    }
}