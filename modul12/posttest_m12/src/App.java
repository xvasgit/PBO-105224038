public class App {
    public static void main(String[] args) throws Exception {
        //Pakai kartu kredit dan via email
        PaymentMethod creditCard = new CreditCard();
        UserNotifier emailNotifier = new EmailSystem();
        OrderService order1 = new OrderService(creditCard, emailNotifier);
        order1.processOrder(100000.0);
        
        //Pakai gift voucher dan via whatsapp
        PaymentMethod voucher = new GiftVoucher();
        UserNotifier waNotifier = new WhatsAppSystem();
        OrderService order2 = new OrderService(voucher, waNotifier);
        order2.processOrder(50000.0);
    }
}
