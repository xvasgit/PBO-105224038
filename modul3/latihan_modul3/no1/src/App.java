import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Operator : ");
        String operator = input.nextLine();
        System.out.print("Angka pertama : ");
        float angka1 = input.nextFloat();
        System.out.print("Angka kedua : ");
        float angka2 = input.nextFloat();

        switch(operator){
            case "+" : 
                System.out.println("Hasil = " + (angka1 + angka2));
                break;
            case "-" :
                System.out.println("Hasil = " + (angka1 - angka2));
                break;
            case "*" :
                System.out.println("Hasil = " + (angka1 * angka2));
                break;
            case "/" : 
                if(angka2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }else{
                    System.out.println("Hasil = " + (angka1 / angka2));
                }
                break;
        }
        input.close();


    }
}
