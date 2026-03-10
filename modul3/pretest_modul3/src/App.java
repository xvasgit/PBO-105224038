import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia (tahun) :");
        int usia = input.nextInt();
        System.out.print("Masukkan berat badan (kg) :");
        float beratBadan = input.nextFloat();
        System.out.print("Masukkan kadar hemoglobin (g/dL) :");
        float kadarHemo = input.nextFloat();

        if(usia >= 18){
            if(beratBadan >= 50.0){
                if(kadarHemo >= 12.5){
                    System.out.println("Anda berhak mengikuti donor darah");
                }else{
                    System.out.println("Ditolak. Kadar Hemoglobin tidak cukup untuk donor darah");
                    
                }
            }else{
                System.out.println("Ditolak. Berat badan tidak cukup untuk donor darah");
                
            }
        }else{
            System.out.println("Ditolak. Tidak cukup umur untuk donor darah");
        }
        input.close();
    }
   
}
