import java.util.*;
import java.io.FileNotFoundException;
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
        Mahasiswa mhs1 = new Mahasiswa();
        try{
            mhs1.setSksMaksimal(1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        //soal 3
        mhs1.sisaSks = 2;//set sisa sks 2
        try{
            mhs1.ambilMataKuliah("Kalkulus", 6);
        }catch(SksTidakCukupException e){
            System.out.println(e.getMessage());
        }

        //soal 4
        SistemAkademik sistemakademik = new SistemAkademik();
        try{
            sistemakademik.gabungKelas("T-012", 0);
        }catch(KelasPenuhException e){
            System.out.println("Error : " + e.getMessage());
        }

        //soal 5
        try{
            sistemakademik.cetakDokumenKrs("krs.txt");
        }catch(FileNotFoundException e){
            System.out.println("Error : nama file harus krs_valid.txt");
        }

    }
}
