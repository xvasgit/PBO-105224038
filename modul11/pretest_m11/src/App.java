import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        
        try{
            int angka1 = input.nextInt();
            int angka2 = input.nextInt();
            int hasil = angka1 / angka2;
        }catch(ArithmeticException e){
            System.out.println("Tidak bisa dibagi nol");
        }catch(InputMismatchException i){
            System.out.println("Salah input");
        }finally{
            input.close();
            System.out.println("Proses kalkulasi selesai dan resurce memori telah dibersihkan");
        }
    }
}
