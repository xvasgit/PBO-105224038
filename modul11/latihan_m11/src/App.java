import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        //soal 1
        int[] arrayInteger = new int[3];
        //simulasi pertama
        try{
        for(int a=0;a<3;a++){
            System.out.print("(simulasi 1) Masukan angka : ");
            int masukan = input.nextInt();
            arrayInteger[a] = masukan;
        }
        }catch(InputMismatchException e){
            System.out.println("Harusnya masukan angka bulat!");
        }
        
        //simulasi kedua
        try{
            for(int a=0;a<4;a++){
            System.out.print("(simulasi 2) Masukan angka : ");
            int masukan = input.nextInt();
            arrayInteger[a] = masukan;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Panjang array-nya hanya tiga!");
        }


        //soal 2
        try{
            Mahasiswa mhs1 = new Mahasiswa();
            mhs1.setSksMaksimal(1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        //soal 3
        
    }
}
