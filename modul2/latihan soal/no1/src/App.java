import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang : ");
        double inputPanjang = input.nextDouble();
        System.out.print("Lebar : ");
        double inputLebar = input.nextDouble();
        System.out.print("Tinggi : ");
        double inputTinggi = input.nextDouble();

        double luas = 2 * (inputPanjang * inputTinggi + inputTinggi * inputLebar);
        // tes
        
        System.out.println("Luas permukaan = " + luas + " meter");
        System.out.println("Cat yang dibutuhkan " +  Math.ceil(luas * 10) + " liter");

        input.close();
    }
}
