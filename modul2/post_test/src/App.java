import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Karyawan : ");
        String inputNama = input.nextLine();
        System.out.print("Gaju Pokok (Rp) : ");
        double inputGaji = input.nextDouble();
        System.out.print("Jam Lembur : ");
        int inputJam = input.nextInt();

        //identitas
        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        System.out.println("Nama Karyawan\t\t: " + inputNama);
        System.out.println("Gaji Pokok (Rp)\t\t: " + inputGaji);
        System.out.println("Jumlah Jam Lembur\t: " + inputJam);


        //slip gaji
        System.out.println("=== SLIP GAJI ===");
        System.out.println("Upah Lembur/Jam\t\t: " + inputGaji / 173.0);
        double totaluanglembur = inputGaji / 173.0 * inputJam;
        System.out.println("Total Uang Lembur\t: " + totaluanglembur);
        double gajikotor = inputGaji+totaluanglembur;
        System.out.println("Gaji Bruto\t\t: " + gajikotor);

        System.out.println("------------------------");
        double pajakpenghasilan = (inputGaji+totaluanglembur) * 5 / 100;
        System.out.println("Potongan Pajak\t\t: " + pajakpenghasilan);
        double potongbpjs = inputGaji * 1 / 100;
        System.out.println("Potongan BPJS\t\t: " + potongbpjs);
        System.out.println("------------------------");
        System.out.println("GAJI BERSIH\t\t: " + (gajikotor - pajakpenghasilan - potongbpjs));
        System.out.println("=================================");

        input.close();
    }
}

